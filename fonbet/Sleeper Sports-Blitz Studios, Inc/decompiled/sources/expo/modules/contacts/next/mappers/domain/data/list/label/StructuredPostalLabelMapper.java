package expo.modules.contacts.next.mappers.domain.data.list.label;

import com.google.firebase.messaging.Constants;
import expo.modules.contacts.next.domain.model.structuredpostal.StructuredPostalLabel;
import expo.modules.kotlin.types.ValueOrUndefined;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: StructuredPostalLabelMapper.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\bJ\u0010\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\n"}, d2 = {"Lexpo/modules/contacts/next/mappers/domain/data/list/label/StructuredPostalLabelMapper;", "", "<init>", "()V", "toDomain", "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;", Constants.ScionAnalytics.PARAM_LABEL, "", "Lexpo/modules/kotlin/types/ValueOrUndefined;", "toRecord", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StructuredPostalLabelMapper {
    public static final StructuredPostalLabelMapper INSTANCE = new StructuredPostalLabelMapper();

    private StructuredPostalLabelMapper() {
    }

    public final StructuredPostalLabel toDomain(String label) {
        String str = label;
        if (str == null || StringsKt.isBlank(str)) {
            return new StructuredPostalLabel.Custom("other");
        }
        String lowerCase = label.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int hashCode = lowerCase.hashCode();
        if (hashCode != 3208415) {
            if (hashCode != 3655441) {
                if (hashCode == 106069776 && lowerCase.equals("other")) {
                    return StructuredPostalLabel.Other.INSTANCE;
                }
            } else if (lowerCase.equals("work")) {
                return StructuredPostalLabel.Work.INSTANCE;
            }
        } else if (lowerCase.equals("home")) {
            return StructuredPostalLabel.Home.INSTANCE;
        }
        return new StructuredPostalLabel.Custom(label);
    }

    public final String toRecord(StructuredPostalLabel label) {
        Intrinsics.checkNotNullParameter(label, "label");
        if (label instanceof StructuredPostalLabel.Home) {
            return "home";
        }
        if (label instanceof StructuredPostalLabel.Work) {
            return "work";
        }
        if (label instanceof StructuredPostalLabel.Other) {
            return "other";
        }
        if (label instanceof StructuredPostalLabel.Custom) {
            return label.getLabel();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ValueOrUndefined<StructuredPostalLabel> toDomain(ValueOrUndefined<String> label) {
        Intrinsics.checkNotNullParameter(label, "label");
        if (label instanceof ValueOrUndefined.Value) {
            return new ValueOrUndefined.Value(INSTANCE.toDomain((String) ((ValueOrUndefined.Value) label).getValue()));
        }
        if (!(label instanceof ValueOrUndefined.Undefined)) {
            throw new NoWhenBranchMatchedException();
        }
        ValueOrUndefined.Companion companion = ValueOrUndefined.INSTANCE;
        ValueOrUndefined.Undefined undefined = ValueOrUndefined.Undefined.INSTANCE;
        Intrinsics.checkNotNull(undefined, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        return undefined;
    }
}
