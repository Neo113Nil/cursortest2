package expo.modules.contacts.next.mappers.domain.data.list.label;

import com.google.firebase.messaging.Constants;
import expo.modules.contacts.next.domain.model.relationship.RelationLabel;
import expo.modules.kotlin.types.ValueOrUndefined;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: RelationshipLabelMapper.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\bJ\u0010\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\n"}, d2 = {"Lexpo/modules/contacts/next/mappers/domain/data/list/label/RelationshipLabelMapper;", "", "<init>", "()V", "toDomain", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;", Constants.ScionAnalytics.PARAM_LABEL, "", "Lexpo/modules/kotlin/types/ValueOrUndefined;", "toRecord", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RelationshipLabelMapper {
    public static final RelationshipLabelMapper INSTANCE = new RelationshipLabelMapper();

    private RelationshipLabelMapper() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final RelationLabel toDomain(String label) {
        String str = label;
        if (str == null || StringsKt.isBlank(str)) {
            return new RelationLabel.Custom("other");
        }
        String lowerCase = label.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case -1281653412:
                if (lowerCase.equals("father")) {
                    return RelationLabel.Father.INSTANCE;
                }
                break;
            case -1266283874:
                if (lowerCase.equals("friend")) {
                    return RelationLabel.Friend.INSTANCE;
                }
                break;
            case -1068320061:
                if (lowerCase.equals("mother")) {
                    return RelationLabel.Mother.INSTANCE;
                }
                break;
            case -995424086:
                if (lowerCase.equals("parent")) {
                    return RelationLabel.Parent.INSTANCE;
                }
                break;
            case -902104540:
                if (lowerCase.equals("sister")) {
                    return RelationLabel.Sister.INSTANCE;
                }
                break;
            case -895757675:
                if (lowerCase.equals("spouse")) {
                    return RelationLabel.Spouse.INSTANCE;
                }
                break;
            case -792929080:
                if (lowerCase.equals("partner")) {
                    return RelationLabel.Partner.INSTANCE;
                }
                break;
            case -554435892:
                if (lowerCase.equals(com.facebook.appevents.codeless.internal.Constants.PATH_TYPE_RELATIVE)) {
                    return RelationLabel.Relative.INSTANCE;
                }
                break;
            case 10894826:
                if (lowerCase.equals("domesticpartner")) {
                    return RelationLabel.DomesticPartner.INSTANCE;
                }
                break;
            case 94631196:
                if (lowerCase.equals("child")) {
                    return RelationLabel.Child.INSTANCE;
                }
                break;
            case 150840512:
                if (lowerCase.equals("brother")) {
                    return RelationLabel.Brother.INSTANCE;
                }
                break;
            case 835260333:
                if (lowerCase.equals("manager")) {
                    return RelationLabel.Manager.INSTANCE;
                }
                break;
            case 1396688936:
                if (lowerCase.equals("referredby")) {
                    return RelationLabel.ReferredBy.INSTANCE;
                }
                break;
            case 1429828318:
                if (lowerCase.equals("assistant")) {
                    return RelationLabel.Assistant.INSTANCE;
                }
                break;
        }
        return new RelationLabel.Custom(label);
    }

    public final String toRecord(RelationLabel label) {
        Intrinsics.checkNotNullParameter(label, "label");
        if (label instanceof RelationLabel.Assistant) {
            return "assistant";
        }
        if (label instanceof RelationLabel.Brother) {
            return "brother";
        }
        if (label instanceof RelationLabel.Child) {
            return "child";
        }
        if (label instanceof RelationLabel.DomesticPartner) {
            return "domesticpartner";
        }
        if (label instanceof RelationLabel.Father) {
            return "father";
        }
        if (label instanceof RelationLabel.Friend) {
            return "friend";
        }
        if (label instanceof RelationLabel.Manager) {
            return "manager";
        }
        if (label instanceof RelationLabel.Mother) {
            return "mother";
        }
        if (label instanceof RelationLabel.Parent) {
            return "parent";
        }
        if (label instanceof RelationLabel.Partner) {
            return "partner";
        }
        if (label instanceof RelationLabel.ReferredBy) {
            return "referredby";
        }
        if (label instanceof RelationLabel.Relative) {
            return com.facebook.appevents.codeless.internal.Constants.PATH_TYPE_RELATIVE;
        }
        if (label instanceof RelationLabel.Sister) {
            return "sister";
        }
        if (label instanceof RelationLabel.Spouse) {
            return "spouse";
        }
        if (label instanceof RelationLabel.Custom) {
            return label.getLabel();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ValueOrUndefined<RelationLabel> toDomain(ValueOrUndefined<String> label) {
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
