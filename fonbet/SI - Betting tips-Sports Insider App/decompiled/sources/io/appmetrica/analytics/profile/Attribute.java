package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.c1;
import io.appmetrica.analytics.impl.Be;
import io.appmetrica.analytics.impl.C0322m4;
import io.appmetrica.analytics.impl.C0366nn;
import io.appmetrica.analytics.impl.C0429qb;
import io.appmetrica.analytics.impl.C0550v8;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.Xm;
import io.appmetrica.analytics.impl.Yk;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Attribute {
    @NonNull
    public static BirthDateAttribute birthDate() {
        return new BirthDateAttribute();
    }

    @NonNull
    public static BooleanAttribute customBoolean(@NonNull String str) {
        return new BooleanAttribute(str, new C0429qb(), new Gb(new C0322m4(100)));
    }

    @NonNull
    public static CounterAttribute customCounter(@NonNull String str) {
        return new CounterAttribute(str, new C0429qb(), new Gb(new C0322m4(100)));
    }

    @NonNull
    public static NumberAttribute customNumber(@NonNull String str) {
        return new NumberAttribute(str, new C0429qb(), new Gb(new C0322m4(100)));
    }

    @NonNull
    public static StringAttribute customString(@NonNull String str) {
        return new StringAttribute(str, new Xm(200, c1.n("String attribute \"", str, "\""), PublicLogger.getAnonymousInstance()), new C0429qb(), new Gb(new C0322m4(100)));
    }

    @NonNull
    public static FirstPartyDataEmailSha256Attribute emailHash() {
        return new FirstPartyDataEmailSha256Attribute(new Yk(new C0550v8()));
    }

    @NonNull
    public static GenderAttribute gender() {
        return new GenderAttribute();
    }

    @NonNull
    public static NameAttribute name() {
        return new NameAttribute();
    }

    @NonNull
    public static NotificationsEnabledAttribute notificationsEnabled() {
        return new NotificationsEnabledAttribute();
    }

    @NonNull
    public static FirstPartyDataPhoneSha256Attribute phoneHash() {
        return new FirstPartyDataPhoneSha256Attribute(new Yk(new Be()));
    }

    @NonNull
    public static FirstPartyDataTelegramLoginSha256Attribute telegramLoginHash() {
        return new FirstPartyDataTelegramLoginSha256Attribute(new Yk(new C0366nn()));
    }
}
