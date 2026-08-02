package com.vk.auth.main;

import android.net.Uri;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.enterphone.choosecountry.Country;
import io.reactivex.rxjava3.internal.operators.observable.b0;
import io.reactivex.rxjava3.internal.operators.observable.m2;
import java.util.regex.Pattern;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pr0;
import xsna.zrp;

/* compiled from: AuthModel.kt */
/* loaded from: classes.dex */
public interface AuthModel {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthModel.kt */
    public static final class EmailAdsAcceptance {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EmailAdsAcceptance[] $VALUES;
        public static final EmailAdsAcceptance ACCEPTED;
        public static final EmailAdsAcceptance NOT_ACCEPTED;
        public static final EmailAdsAcceptance UNKNOWN;

        static {
            EmailAdsAcceptance emailAdsAcceptance = new EmailAdsAcceptance(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            UNKNOWN = emailAdsAcceptance;
            EmailAdsAcceptance emailAdsAcceptance2 = new EmailAdsAcceptance(SignalingProtocol.PARTICIPANT_STATE_ACCEPTED, 1);
            ACCEPTED = emailAdsAcceptance2;
            EmailAdsAcceptance emailAdsAcceptance3 = new EmailAdsAcceptance("NOT_ACCEPTED", 2);
            NOT_ACCEPTED = emailAdsAcceptance3;
            EmailAdsAcceptance[] emailAdsAcceptanceArr = {emailAdsAcceptance, emailAdsAcceptance2, emailAdsAcceptance3};
            $VALUES = emailAdsAcceptanceArr;
            $ENTRIES = new asp(emailAdsAcceptanceArr);
        }

        public EmailAdsAcceptance() {
            throw null;
        }

        public static EmailAdsAcceptance valueOf(String str) {
            return (EmailAdsAcceptance) Enum.valueOf(EmailAdsAcceptance.class, str);
        }

        public static EmailAdsAcceptance[] values() {
            return (EmailAdsAcceptance[]) $VALUES.clone();
        }
    }

    /* compiled from: AuthModel.kt */
    /* loaded from: classes15.dex */
    public static final class a {
        public static String a(AuthModel authModel) {
            return authModel.l(authModel.a().d);
        }

        public static String b(AuthModel authModel) {
            return authModel.c(authModel.a().d);
        }
    }

    Country a();

    int b();

    String c(String str);

    m2 d(AuthResult authResult);

    EmailAdsAcceptance e();

    String f();

    Pattern g();

    void h(AuthResult authResult, Uri uri);

    b0 i();

    int j();

    pr0 k();

    String l(String str);

    Pattern m();

    VkClientLibverifyInfo n();
}
