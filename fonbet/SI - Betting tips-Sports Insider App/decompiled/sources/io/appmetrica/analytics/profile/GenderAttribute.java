package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Bi;
import io.appmetrica.analytics.impl.C0018a8;
import io.appmetrica.analytics.impl.C0471s4;
import io.appmetrica.analytics.impl.C0498t6;
import io.appmetrica.analytics.impl.C0638yl;
import io.appmetrica.analytics.impl.InterfaceC0137eo;
import io.appmetrica.analytics.impl.Xk;
import io.appmetrica.analytics.impl.Ym;
import io.appmetrica.analytics.impl.Z7;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class GenderAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final C0498t6 f15272a = new C0498t6("appmetrica_gender", new C0018a8(), new C0638yl());

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");


        /* renamed from: a, reason: collision with root package name */
        private final String f15274a;

        Gender(String str) {
            this.f15274a = str;
        }

        public String getStringValue() {
            return this.f15274a;
        }
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0137eo> withValue(@NonNull Gender gender) {
        String str = this.f15272a.f14668c;
        String stringValue = gender.getStringValue();
        Z7 z7 = new Z7();
        C0498t6 c0498t6 = this.f15272a;
        return new UserProfileUpdate<>(new Ym(str, stringValue, z7, c0498t6.f14666a, new C0471s4(c0498t6.f14667b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0137eo> withValueIfUndefined(@NonNull Gender gender) {
        String str = this.f15272a.f14668c;
        String stringValue = gender.getStringValue();
        Z7 z7 = new Z7();
        C0498t6 c0498t6 = this.f15272a;
        return new UserProfileUpdate<>(new Ym(str, stringValue, z7, c0498t6.f14666a, new Xk(c0498t6.f14667b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0137eo> withValueReset() {
        C0498t6 c0498t6 = this.f15272a;
        return new UserProfileUpdate<>(new Bi(0, c0498t6.f14668c, c0498t6.f14666a, c0498t6.f14667b));
    }
}
