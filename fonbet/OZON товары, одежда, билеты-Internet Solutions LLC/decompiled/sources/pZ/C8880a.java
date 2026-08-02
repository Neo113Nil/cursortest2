package pZ;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

/* renamed from: pZ.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8880a extends f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Intent f80347a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f80348b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f80349c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<? extends EZ.a<?>> f80350d;

    /* renamed from: pZ.a$a, reason: collision with other inner class name */
    public static final class C1351a implements EZ.a<C8880a> {
        private static void a(r rVar, C8880a c8880a, int i11) {
            if (c8880a.a().resolveActivity(rVar.getPackageManager()) != null) {
                if (i11 > 0) {
                    rVar.startActivityForResult(c8880a.a(), i11, c8880a.b());
                } else {
                    rVar.startActivity(c8880a.a(), c8880a.b());
                }
            }
        }

        @Override // EZ.a
        public final void navigate(@NotNull EZ.g navigator, @NotNull EZ.e<C8880a> response) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            C8880a b11 = response.b();
            r activity = navigator.getActivity();
            Integer requestCode = b11.getRequestCode();
            a(activity, b11, requestCode != null ? requestCode.intValue() : 0);
        }

        @Override // EZ.a
        public final void navigateForResult(@NotNull EZ.g navigator, @NotNull EZ.e<C8880a> response, int i11) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            C8880a b11 = response.b();
            r activity = navigator.getActivity();
            Integer requestCode = b11.getRequestCode();
            if (requestCode != null) {
                i11 = requestCode.intValue();
            }
            a(activity, b11, i11);
        }
    }

    public /* synthetic */ C8880a(Intent intent) {
        this(intent, null, null);
    }

    @NotNull
    public final Intent a() {
        return this.f80347a;
    }

    public final Bundle b() {
        return this.f80349c;
    }

    @Override // pZ.f
    @NotNull
    public final kotlin.reflect.d<? extends EZ.a<?>> getNavigator() {
        return this.f80350d;
    }

    public final Integer getRequestCode() {
        return this.f80348b;
    }

    @NotNull
    public final String toString() {
        return "ActivityDestination(intent=" + this.f80347a + ", requestCode=" + this.f80348b + ", options=" + this.f80349c + ", navigator=" + this.f80350d + ")";
    }

    public C8880a(@NotNull Intent intent, Integer num, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f80347a = intent;
        this.f80348b = num;
        this.f80349c = bundle;
        this.f80350d = N.b(C1351a.class);
    }
}
