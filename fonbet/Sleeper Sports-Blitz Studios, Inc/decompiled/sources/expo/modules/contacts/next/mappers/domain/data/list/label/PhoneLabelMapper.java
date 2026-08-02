package expo.modules.contacts.next.mappers.domain.data.list.label;

import com.google.firebase.messaging.Constants;
import expo.modules.contacts.next.domain.model.phone.PhoneLabel;
import expo.modules.kotlin.types.ValueOrUndefined;
import io.sentry.protocol.SentryThread;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PhoneLabelMapper.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\bJ\u0010\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\n"}, d2 = {"Lexpo/modules/contacts/next/mappers/domain/data/list/label/PhoneLabelMapper;", "", "<init>", "()V", "toDomain", "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;", Constants.ScionAnalytics.PARAM_LABEL, "", "Lexpo/modules/kotlin/types/ValueOrUndefined;", "toRecord", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PhoneLabelMapper {
    public static final PhoneLabelMapper INSTANCE = new PhoneLabelMapper();

    private PhoneLabelMapper() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final PhoneLabel toDomain(String label) {
        String str = label;
        if (str == null || StringsKt.isBlank(str)) {
            return new PhoneLabel.Custom("other");
        }
        String lowerCase = label.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case -1171131891:
                if (lowerCase.equals("otherfax")) {
                    return PhoneLabel.OtherFax.INSTANCE;
                }
                break;
            case -1072846468:
                if (lowerCase.equals("faxhome")) {
                    return PhoneLabel.FaxHome.INSTANCE;
                }
                break;
            case -1072399442:
                if (lowerCase.equals("faxwork")) {
                    return PhoneLabel.FaxWork.INSTANCE;
                }
                break;
            case -1068855134:
                if (lowerCase.equals("mobile")) {
                    return PhoneLabel.Mobile.INSTANCE;
                }
                break;
            case -863168709:
                if (lowerCase.equals("ttyTdd")) {
                    return PhoneLabel.TtyTdd.INSTANCE;
                }
                break;
            case -507659338:
                if (lowerCase.equals("companymain")) {
                    return PhoneLabel.CompanyMain.INSTANCE;
                }
                break;
            case -172220347:
                if (lowerCase.equals("callback")) {
                    return PhoneLabel.Callback.INSTANCE;
                }
                break;
            case -157612301:
                if (lowerCase.equals("workmobile")) {
                    return PhoneLabel.WorkMobile.INSTANCE;
                }
                break;
            case 98260:
                if (lowerCase.equals("car")) {
                    return PhoneLabel.Car.INSTANCE;
                }
                break;
            case 108243:
                if (lowerCase.equals("mms")) {
                    return PhoneLabel.Mms.INSTANCE;
                }
                break;
            case 3208415:
                if (lowerCase.equals("home")) {
                    return PhoneLabel.Home.INSTANCE;
                }
                break;
            case 3241780:
                if (lowerCase.equals("isdn")) {
                    return PhoneLabel.Isdn.INSTANCE;
                }
                break;
            case 3343801:
                if (lowerCase.equals(SentryThread.JsonKeys.MAIN)) {
                    return PhoneLabel.Main.INSTANCE;
                }
                break;
            case 3655441:
                if (lowerCase.equals("work")) {
                    return PhoneLabel.Work.INSTANCE;
                }
                break;
            case 106069776:
                if (lowerCase.equals("other")) {
                    return PhoneLabel.Other.INSTANCE;
                }
                break;
            case 106426307:
                if (lowerCase.equals("pager")) {
                    return PhoneLabel.Pager.INSTANCE;
                }
                break;
            case 108270587:
                if (lowerCase.equals("radio")) {
                    return PhoneLabel.Radio.INSTANCE;
                }
                break;
            case 110244366:
                if (lowerCase.equals("telex")) {
                    return PhoneLabel.Telex.INSTANCE;
                }
                break;
            case 1105652562:
                if (lowerCase.equals("workpager")) {
                    return PhoneLabel.WorkPager.INSTANCE;
                }
                break;
            case 1429828318:
                if (lowerCase.equals("assistant")) {
                    return PhoneLabel.Assistant.INSTANCE;
                }
                break;
        }
        return new PhoneLabel.Custom(label);
    }

    public final String toRecord(PhoneLabel label) {
        Intrinsics.checkNotNullParameter(label, "label");
        if (label instanceof PhoneLabel.Home) {
            return "home";
        }
        if (label instanceof PhoneLabel.Mobile) {
            return "mobile";
        }
        if (label instanceof PhoneLabel.Work) {
            return "work";
        }
        if (label instanceof PhoneLabel.FaxWork) {
            return "faxWork";
        }
        if (label instanceof PhoneLabel.FaxHome) {
            return "faxHome";
        }
        if (label instanceof PhoneLabel.Pager) {
            return "pager";
        }
        if (label instanceof PhoneLabel.Other) {
            return "other";
        }
        if (label instanceof PhoneLabel.Callback) {
            return "callback";
        }
        if (label instanceof PhoneLabel.Car) {
            return "car";
        }
        if (label instanceof PhoneLabel.CompanyMain) {
            return "companyMain";
        }
        if (label instanceof PhoneLabel.Isdn) {
            return "isdn";
        }
        if (label instanceof PhoneLabel.Main) {
            return SentryThread.JsonKeys.MAIN;
        }
        if (label instanceof PhoneLabel.OtherFax) {
            return "otherFax";
        }
        if (label instanceof PhoneLabel.Radio) {
            return "radio";
        }
        if (label instanceof PhoneLabel.Telex) {
            return "telex";
        }
        if (label instanceof PhoneLabel.TtyTdd) {
            return "ttyTdd";
        }
        if (label instanceof PhoneLabel.WorkMobile) {
            return "workMobile";
        }
        if (label instanceof PhoneLabel.WorkPager) {
            return "workPager";
        }
        if (label instanceof PhoneLabel.Assistant) {
            return "assistant";
        }
        if (label instanceof PhoneLabel.Mms) {
            return "mms";
        }
        if (label instanceof PhoneLabel.Custom) {
            return label.getLabel();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ValueOrUndefined<PhoneLabel> toDomain(ValueOrUndefined<String> label) {
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
