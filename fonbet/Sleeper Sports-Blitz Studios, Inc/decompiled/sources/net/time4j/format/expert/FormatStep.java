package net.time4j.format.expert;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.time4j.engine.AttributeQuery;
import net.time4j.engine.ChronoCondition;
import net.time4j.engine.ChronoDisplay;
import net.time4j.engine.ChronoElement;
import net.time4j.format.Attributes;
import net.time4j.format.Leniency;
import net.time4j.format.internal.DualFormatElement;

/* loaded from: classes10.dex */
final class FormatStep {
    private final AttributeQuery fullAttrs;
    private final int lastOrBlockIndex;
    private final int level;
    private final boolean orMarker;
    private final int padLeft;
    private final int padRight;
    private final FormatProcessor<?> processor;
    private final int reserved;
    private final int section;
    private final AttributeSet sectionalAttrs;

    FormatStep(FormatProcessor<?> formatProcessor, int i, int i2, AttributeSet attributeSet) {
        this(formatProcessor, i, i2, attributeSet, null, 0, 0, 0, false, -1);
    }

    private FormatStep(FormatProcessor<?> formatProcessor, int i, int i2, AttributeSet attributeSet, AttributeQuery attributeQuery, int i3, int i4, int i5, boolean z, int i6) {
        if (formatProcessor == null) {
            throw new NullPointerException("Missing format processor.");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Invalid level: " + i);
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Invalid section: " + i2);
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("Reserved chars must not be negative: " + i3);
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("Invalid pad-width: " + i4);
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("Invalid pad-width: " + i5);
        }
        this.processor = formatProcessor;
        this.level = i;
        this.section = i2;
        this.sectionalAttrs = attributeSet;
        this.fullAttrs = attributeQuery;
        this.reserved = i3;
        this.padLeft = i4;
        this.padRight = i5;
        this.orMarker = z;
        this.lastOrBlockIndex = i6;
    }

    int print(ChronoDisplay chronoDisplay, Appendable appendable, AttributeQuery attributeQuery, Set<ElementPosition> set, boolean z) throws IOException {
        StringBuilder sb;
        int i;
        LinkedHashSet linkedHashSet;
        int i2;
        int i3 = 0;
        if (!isPrinting(chronoDisplay)) {
            return 0;
        }
        AttributeQuery query = z ? this.fullAttrs : getQuery(attributeQuery);
        if (this.padLeft == 0 && this.padRight == 0) {
            return this.processor.print(chronoDisplay, appendable, query, set, z);
        }
        if (appendable instanceof StringBuilder) {
            sb = (StringBuilder) appendable;
            i = sb.length();
        } else {
            sb = new StringBuilder();
            i = -1;
        }
        StringBuilder sb2 = sb;
        if (!(appendable instanceof CharSequence) || set == null) {
            linkedHashSet = null;
            i2 = -1;
        } else {
            if (sb2 == appendable) {
                FormatProcessor<?> formatProcessor = this.processor;
                if ((formatProcessor instanceof CustomizedProcessor) || (formatProcessor instanceof StyleProcessor)) {
                    i2 = 0;
                    linkedHashSet = new LinkedHashSet();
                }
            }
            i2 = ((CharSequence) appendable).length();
            linkedHashSet = new LinkedHashSet();
        }
        LinkedHashSet<ElementPosition> linkedHashSet2 = linkedHashSet;
        boolean isStrict = isStrict(query);
        char padChar = getPadChar(query);
        int length = sb2.length();
        this.processor.print(chronoDisplay, sb2, query, linkedHashSet2, z);
        int length2 = sb2.length() - length;
        int i4 = this.padLeft;
        if (i4 <= 0) {
            if (isStrict && length2 > this.padRight) {
                throw new IllegalArgumentException(padExceeded());
            }
            if (i == -1) {
                appendable.append(sb2);
            }
            while (length2 < this.padRight) {
                appendable.append(padChar);
                length2++;
            }
            if (i2 != -1) {
                for (ElementPosition elementPosition : linkedHashSet2) {
                    set.add(new ElementPosition(elementPosition.getElement(), elementPosition.getStartIndex() + i2, elementPosition.getEndIndex() + i2));
                }
            }
            return length2;
        }
        if (isStrict && length2 > i4) {
            throw new IllegalArgumentException(padExceeded());
        }
        int i5 = length2;
        while (i5 < this.padLeft) {
            if (i == -1) {
                appendable.append(padChar);
            } else {
                sb2.insert(i, padChar);
            }
            i5++;
            i3++;
        }
        if (i == -1) {
            appendable.append(sb2);
        }
        if (i2 != -1) {
            int i6 = i2 + i3;
            for (ElementPosition elementPosition2 : linkedHashSet2) {
                set.add(new ElementPosition(elementPosition2.getElement(), elementPosition2.getStartIndex() + i6, elementPosition2.getEndIndex() + i6));
            }
        }
        int i7 = this.padRight;
        if (i7 > 0) {
            if (isStrict && length2 > i7) {
                throw new IllegalArgumentException(padExceeded());
            }
            while (length2 < this.padRight) {
                appendable.append(padChar);
                length2++;
                i5++;
            }
        }
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0089, code lost:
    
        r9 = r8.padRight;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
    
        if (r9 <= 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
    
        if ((r3 + r11) == r9) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0090, code lost:
    
        r10.setError(r13 - r11, padMismatched());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0098, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void parse(CharSequence charSequence, ParseLog parseLog, AttributeQuery attributeQuery, ParsedEntity<?> parsedEntity, boolean z) {
        int i;
        AttributeQuery query = z ? this.fullAttrs : getQuery(attributeQuery);
        if (this.padLeft == 0 && this.padRight == 0) {
            doParse(charSequence, parseLog, query, parsedEntity, z);
            return;
        }
        boolean isStrict = isStrict(query);
        char padChar = getPadChar(query);
        int position = parseLog.getPosition();
        int length = charSequence.length();
        int i2 = position;
        while (i2 < length && charSequence.charAt(i2) == padChar) {
            i2++;
        }
        int i3 = i2 - position;
        if (isStrict && i3 > this.padLeft) {
            parseLog.setError(position, padExceeded());
            return;
        }
        parseLog.setPosition(i2);
        doParse(charSequence, parseLog, query, parsedEntity, z);
        if (parseLog.isError()) {
            return;
        }
        int position2 = parseLog.getPosition();
        int i4 = (position2 - position) - i3;
        if (isStrict && (i = this.padLeft) > 0 && i3 + i4 != i) {
            parseLog.setError(position, padMismatched());
            return;
        }
        int i5 = 0;
        while (position2 < length && ((!isStrict || i4 + i5 < this.padRight) && charSequence.charAt(position2) == padChar)) {
            position2++;
            i5++;
        }
        parseLog.setPosition(position2);
    }

    int getLevel() {
        return this.level;
    }

    int getSection() {
        return this.section;
    }

    boolean isDecimal() {
        FormatProcessor<?> formatProcessor = this.processor;
        return (formatProcessor instanceof FractionProcessor) || (formatProcessor instanceof DecimalProcessor);
    }

    boolean isNumerical() {
        return this.processor.isNumerical();
    }

    FormatProcessor<?> getProcessor() {
        return this.processor;
    }

    FormatStep quickPath(ChronoFormatter<?> chronoFormatter) {
        AttributeSet attributes0 = chronoFormatter.getAttributes0();
        if (this.sectionalAttrs != null) {
            attributes0 = attributes0.withAttributes(new Attributes.Builder().setAll(attributes0.getAttributes()).setAll(this.sectionalAttrs.getAttributes()).build());
        }
        AttributeSet attributeSet = attributes0;
        return new FormatStep(this.processor.quickPath(chronoFormatter, attributeSet, this.reserved), this.level, this.section, this.sectionalAttrs, attributeSet, this.reserved, this.padLeft, this.padRight, this.orMarker, this.lastOrBlockIndex);
    }

    FormatStep updateElement(ChronoElement<?> chronoElement) {
        FormatProcessor<?> update = update(this.processor, chronoElement);
        return this.processor == update ? this : new FormatStep(update, this.level, this.section, this.sectionalAttrs, this.fullAttrs, this.reserved, this.padLeft, this.padRight, this.orMarker, this.lastOrBlockIndex);
    }

    FormatStep reserve(int i) {
        return new FormatStep(this.processor, this.level, this.section, this.sectionalAttrs, null, this.reserved + i, this.padLeft, this.padRight, this.orMarker, this.lastOrBlockIndex);
    }

    FormatStep pad(int i, int i2) {
        return new FormatStep(this.processor, this.level, this.section, this.sectionalAttrs, null, this.reserved, this.padLeft + i, this.padRight + i2, this.orMarker, this.lastOrBlockIndex);
    }

    FormatStep startNewOrBlock() {
        if (this.orMarker) {
            throw new IllegalStateException("Cannot start or-block twice.");
        }
        return new FormatStep(this.processor, this.level, this.section, this.sectionalAttrs, null, this.reserved, this.padLeft, this.padRight, true, -1);
    }

    FormatStep markLastOrBlock(int i) {
        if (!this.orMarker) {
            throw new IllegalStateException("This step is not starting an or-block.");
        }
        return new FormatStep(this.processor, this.level, this.section, this.sectionalAttrs, this.fullAttrs, this.reserved, this.padLeft, this.padRight, true, i);
    }

    boolean isNewOrBlockStarted() {
        return this.orMarker;
    }

    int skipTrailingOrBlocks() {
        return this.lastOrBlockIndex;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FormatStep) {
            FormatStep formatStep = (FormatStep) obj;
            if (this.processor.equals(formatStep.processor) && this.level == formatStep.level && this.section == formatStep.section && isEqual(this.sectionalAttrs, formatStep.sectionalAttrs) && isEqual(this.fullAttrs, formatStep.fullAttrs) && this.reserved == formatStep.reserved && this.padLeft == formatStep.padLeft && this.padRight == formatStep.padRight && this.orMarker == formatStep.orMarker && this.lastOrBlockIndex == formatStep.lastOrBlockIndex) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.processor.hashCode() * 7;
        AttributeSet attributeSet = this.sectionalAttrs;
        return hashCode + ((attributeSet == null ? 0 : attributeSet.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[processor=");
        sb.append(this.processor);
        sb.append(", level=");
        sb.append(this.level);
        sb.append(", section=");
        sb.append(this.section);
        if (this.sectionalAttrs != null) {
            sb.append(", attributes=");
            sb.append(this.sectionalAttrs);
        }
        sb.append(", reserved=");
        sb.append(this.reserved);
        sb.append(", pad-left=");
        sb.append(this.padLeft);
        sb.append(", pad-right=");
        sb.append(this.padRight);
        if (this.orMarker) {
            sb.append(", or-block-started");
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    private AttributeQuery getQuery(AttributeQuery attributeQuery) {
        return this.sectionalAttrs == null ? attributeQuery : new MergedAttributes(this.sectionalAttrs, attributeQuery);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <V> FormatProcessor<V> update(FormatProcessor<V> formatProcessor, ChronoElement<?> chronoElement) {
        if (formatProcessor.getElement() == null) {
            return formatProcessor;
        }
        if (formatProcessor.getElement().getType() != chronoElement.getType() && !(chronoElement instanceof DualFormatElement)) {
            throw new IllegalArgumentException("Cannot change element value type: " + chronoElement.name());
        }
        return formatProcessor.withElement(chronoElement);
    }

    private static boolean isEqual(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private void doParse(CharSequence charSequence, ParseLog parseLog, AttributeQuery attributeQuery, ParsedEntity<?> parsedEntity, boolean z) {
        ParseLog parseLog2;
        int position = parseLog.getPosition();
        try {
            parseLog2 = parseLog;
        } catch (RuntimeException e) {
            e = e;
            parseLog2 = parseLog;
        }
        try {
            this.processor.parse(charSequence, parseLog2, attributeQuery, parsedEntity, z);
        } catch (RuntimeException e2) {
            e = e2;
            parseLog2.setError(position, e.getMessage());
        }
    }

    private boolean isStrict(AttributeQuery attributeQuery) {
        return ((Leniency) attributeQuery.get(Attributes.LENIENCY, Leniency.SMART)).isStrict();
    }

    private char getPadChar(AttributeQuery attributeQuery) {
        return ((Character) attributeQuery.get(Attributes.PAD_CHAR, ' ')).charValue();
    }

    private String padExceeded() {
        return "Pad width exceeded: " + this.processor.getElement().name();
    }

    private String padMismatched() {
        return "Pad width mismatched: " + this.processor.getElement().name();
    }

    private boolean isPrinting(ChronoDisplay chronoDisplay) {
        ChronoCondition<ChronoDisplay> condition;
        AttributeSet attributeSet = this.sectionalAttrs;
        return attributeSet == null || (condition = attributeSet.getCondition()) == null || condition.test(chronoDisplay);
    }
}
