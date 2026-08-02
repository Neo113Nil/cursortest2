package androidx.car.app.model;

import android.text.SpannableString;
import android.text.Spanned;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import xsna.alk;
import xsna.h5s;
import xsna.up;

/* loaded from: classes11.dex */
public final class CarText {
    private final List<SpanWrapper> mSpans;
    private final List<List<SpanWrapper>> mSpansForVariants;
    private final String mText;
    private final List<String> mTextVariants;

    public static final class Builder {
        CharSequence mText;
        List<CharSequence> mTextVariants = new ArrayList();

        public Builder(@NonNull CharSequence charSequence) {
            Objects.requireNonNull(charSequence);
            this.mText = charSequence;
        }

        @NonNull
        public Builder addVariant(@NonNull CharSequence charSequence) {
            List<CharSequence> list = this.mTextVariants;
            Objects.requireNonNull(charSequence);
            list.add(charSequence);
            return this;
        }

        @NonNull
        public CarText build() {
            return new CarText(this);
        }
    }

    private CarText() {
        this.mText = "";
        List list = Collections.EMPTY_LIST;
        this.mSpans = list;
        this.mTextVariants = list;
        this.mSpansForVariants = list;
    }

    @NonNull
    public static CarText create(@NonNull CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new CarText(charSequence);
    }

    private static CharSequence getCharSequence(String str, List<SpanWrapper> list) {
        SpannableString spannableString = new SpannableString(str);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (SpanWrapper spanWrapper : list) {
            spannableString.setSpan(spanWrapper.getCarSpan(), spanWrapper.getStart(), spanWrapper.getEnd(), spanWrapper.getFlags());
        }
        return spannableString;
    }

    public static boolean isNullOrEmpty(@Nullable CarText carText) {
        return carText == null || carText.isEmpty();
    }

    @Nullable
    public static String toShortString(@Nullable CarText carText) {
        if (carText == null) {
            return null;
        }
        String carText2 = carText.toString();
        if (carText2.length() <= 16) {
            return carText2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(carText2.substring(0, 8));
        sb.append("~");
        return up.b(carText2.length() - 8, carText2, sb);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarText)) {
            return false;
        }
        CarText carText = (CarText) obj;
        return Objects.equals(this.mText, carText.mText) && Objects.equals(this.mSpans, carText.mSpans) && Objects.equals(this.mTextVariants, carText.mTextVariants) && Objects.equals(this.mSpansForVariants, carText.mSpansForVariants);
    }

    @NonNull
    public List<SpanWrapper> getSpans() {
        return this.mSpans;
    }

    @NonNull
    public List<List<SpanWrapper>> getSpansForVariants() {
        return this.mSpansForVariants;
    }

    @NonNull
    public List<CharSequence> getVariants() {
        if (this.mTextVariants.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.mTextVariants.size(); i++) {
            arrayList.add(getCharSequence(this.mTextVariants.get(i), this.mSpansForVariants.get(i)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int hashCode() {
        return Objects.hash(this.mText, this.mSpans, this.mTextVariants, this.mSpansForVariants);
    }

    public boolean isEmpty() {
        return this.mText.isEmpty();
    }

    @NonNull
    public CharSequence toCharSequence() {
        return getCharSequence(this.mText, this.mSpans);
    }

    @NonNull
    public String toString() {
        return this.mText;
    }

    private static List<SpanWrapper> getSpans(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            for (Object obj : spanned.getSpans(0, charSequence.length(), Object.class)) {
                if (obj instanceof CarSpan) {
                    arrayList.add(new SpanWrapper(spanned, (CarSpan) obj));
                }
            }
        }
        return alk.H(arrayList);
    }

    public static class SpanWrapper {

        @NonNull
        private final CarSpan mCarSpan;
        private final int mEnd;
        private final int mFlags;
        private final int mStart;

        public SpanWrapper(@NonNull Spanned spanned, @NonNull CarSpan carSpan) {
            this.mStart = spanned.getSpanStart(carSpan);
            this.mEnd = spanned.getSpanEnd(carSpan);
            this.mFlags = spanned.getSpanFlags(carSpan);
            this.mCarSpan = carSpan;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpanWrapper)) {
                return false;
            }
            SpanWrapper spanWrapper = (SpanWrapper) obj;
            return this.mStart == spanWrapper.mStart && this.mEnd == spanWrapper.mEnd && this.mFlags == spanWrapper.mFlags && Objects.equals(this.mCarSpan, spanWrapper.mCarSpan);
        }

        @NonNull
        public CarSpan getCarSpan() {
            return this.mCarSpan;
        }

        public int getEnd() {
            return this.mEnd;
        }

        public int getFlags() {
            return this.mFlags;
        }

        public int getStart() {
            return this.mStart;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.mStart), Integer.valueOf(this.mEnd), Integer.valueOf(this.mFlags), this.mCarSpan);
        }

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder(X3.j.d);
            sb.append(this.mCarSpan);
            sb.append(": ");
            sb.append(this.mStart);
            sb.append(", ");
            sb.append(this.mEnd);
            sb.append(", flags: ");
            return h5s.c(this.mFlags, X3.j.e, sb);
        }

        public SpanWrapper() {
            this.mStart = 0;
            this.mEnd = 0;
            this.mFlags = 0;
            this.mCarSpan = new CarSpan();
        }
    }

    public CarText(CharSequence charSequence) {
        this.mText = charSequence.toString();
        this.mSpans = getSpans(charSequence);
        List list = Collections.EMPTY_LIST;
        this.mTextVariants = list;
        this.mSpansForVariants = list;
    }

    public CarText(Builder builder) {
        this.mText = builder.mText.toString();
        this.mSpans = getSpans(builder.mText);
        List<CharSequence> list = builder.mTextVariants;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            CharSequence charSequence = list.get(i);
            arrayList.add(charSequence.toString());
            arrayList2.add(getSpans(charSequence));
        }
        this.mTextVariants = alk.H(arrayList);
        this.mSpansForVariants = alk.H(arrayList2);
    }
}
