package expo.modules.contacts.next.mappers.domain.data.list.label;

import com.google.firebase.messaging.Constants;
import expo.modules.contacts.models.DateModelKt;
import expo.modules.contacts.next.domain.model.event.EventLabel;
import expo.modules.kotlin.types.ValueOrUndefined;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: EventLabelMapper.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\bJ\u0010\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\n"}, d2 = {"Lexpo/modules/contacts/next/mappers/domain/data/list/label/EventLabelMapper;", "", "<init>", "()V", "toDomain", "Lexpo/modules/contacts/next/domain/model/event/EventLabel;", Constants.ScionAnalytics.PARAM_LABEL, "", "Lexpo/modules/kotlin/types/ValueOrUndefined;", "toRecord", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EventLabelMapper {
    public static final EventLabelMapper INSTANCE = new EventLabelMapper();

    private EventLabelMapper() {
    }

    public final EventLabel toDomain(String label) {
        String str = label;
        if (str == null || StringsKt.isBlank(str)) {
            return new EventLabel.Custom("other");
        }
        String lowerCase = label.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int hashCode = lowerCase.hashCode();
        if (hashCode != -940675184) {
            if (hashCode != 106069776) {
                if (hashCode == 1069376125 && lowerCase.equals(DateModelKt.BIRTHDAY)) {
                    return EventLabel.Birthday.INSTANCE;
                }
            } else if (lowerCase.equals("other")) {
                return EventLabel.Other.INSTANCE;
            }
        } else if (lowerCase.equals("anniversary")) {
            return EventLabel.Anniversary.INSTANCE;
        }
        return new EventLabel.Custom(label);
    }

    public final String toRecord(EventLabel label) {
        Intrinsics.checkNotNullParameter(label, "label");
        if (label instanceof EventLabel.Anniversary) {
            return "anniversary";
        }
        if (label instanceof EventLabel.Birthday) {
            return DateModelKt.BIRTHDAY;
        }
        if (label instanceof EventLabel.Other) {
            return "other";
        }
        if (label instanceof EventLabel.Custom) {
            return label.getLabel();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ValueOrUndefined<EventLabel> toDomain(ValueOrUndefined<String> label) {
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
