package g7;

import C2.f0;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: g7.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6657c extends f0 {

    /* renamed from: g7.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private String f63935a = "";

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private String f63936b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f63937c;

        /* renamed from: d, reason: collision with root package name */
        private String f63938d;

        /* renamed from: e, reason: collision with root package name */
        private String f63939e;

        /* renamed from: f, reason: collision with root package name */
        private Uri f63940f;

        /* renamed from: g, reason: collision with root package name */
        private String f63941g;

        @NotNull
        public final C6657c a() {
            String id2 = this.f63935a;
            String idToken = this.f63936b;
            String str = this.f63937c;
            String str2 = this.f63938d;
            String str3 = this.f63939e;
            Uri uri = this.f63940f;
            String str4 = this.f63941g;
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(idToken, "idToken");
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(idToken, "idToken");
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", id2);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", idToken);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str2);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str3);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str4);
            bundle.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
            C6657c c6657c = new C6657c("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle);
            if (id2.length() <= 0) {
                throw new IllegalArgumentException("id should not be empty");
            }
            if (idToken.length() > 0) {
                return c6657c;
            }
            throw new IllegalArgumentException("idToken should not be empty");
        }

        @NotNull
        public final void b(String str) {
            this.f63937c = str;
        }

        @NotNull
        public final void c(String str) {
            this.f63938d = str;
        }

        @NotNull
        public final void d(String str) {
            this.f63939e = str;
        }

        @NotNull
        public final void e(@NonNull String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f63935a = id2;
        }

        @NotNull
        public final void f(@NonNull String idToken) {
            Intrinsics.checkNotNullParameter(idToken, "idToken");
            this.f63936b = idToken;
        }

        @NotNull
        public final void g(String str) {
            this.f63941g = str;
        }

        @NotNull
        public final void h(Uri uri) {
            this.f63940f = uri;
        }
    }
}
