package u4;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m3.C8050C;
import m3.C8056I;

/* loaded from: classes.dex */
public interface J {

    /* loaded from: classes8.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f99960a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f99961b;

        public a(String str, byte[] bArr) {
            this.f99960a = str;
            this.f99961b = bArr;
        }
    }

    /* loaded from: classes8.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f99962a;

        /* renamed from: b, reason: collision with root package name */
        public final int f99963b;

        /* renamed from: c, reason: collision with root package name */
        public final List<a> f99964c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f99965d;

        public b(int i11, String str, int i12, ArrayList arrayList, byte[] bArr) {
            this.f99962a = str;
            this.f99963b = i12;
            this.f99964c = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
            this.f99965d = bArr;
        }

        public final int a() {
            int i11 = this.f99963b;
            if (i11 == 2) {
                return 2048;
            }
            if (i11 != 3) {
                return 0;
            }
            return UserVerificationMethods.USER_VERIFY_NONE;
        }
    }

    public interface c {
    }

    /* loaded from: classes8.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f99966a;

        /* renamed from: b, reason: collision with root package name */
        private final int f99967b;

        /* renamed from: c, reason: collision with root package name */
        private final int f99968c;

        /* renamed from: d, reason: collision with root package name */
        private int f99969d;

        /* renamed from: e, reason: collision with root package name */
        private String f99970e;

        public d(int i11, int i12) {
            this(LinearLayoutManager.INVALID_OFFSET, i11, i12);
        }

        public final void a() {
            int i11 = this.f99969d;
            this.f99969d = i11 == Integer.MIN_VALUE ? this.f99967b : i11 + this.f99968c;
            this.f99970e = this.f99966a + this.f99969d;
        }

        public final String b() {
            if (this.f99969d != Integer.MIN_VALUE) {
                return this.f99970e;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        public final int c() {
            int i11 = this.f99969d;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        public d(int i11, int i12, int i13) {
            String str;
            if (i11 != Integer.MIN_VALUE) {
                str = i11 + "/";
            } else {
                str = "";
            }
            this.f99966a = str;
            this.f99967b = i12;
            this.f99968c = i13;
            this.f99969d = LinearLayoutManager.INVALID_OFFSET;
            this.f99970e = "";
        }
    }

    void a(C8056I c8056i, N3.r rVar, d dVar);

    void b();

    void c(int i11, C8050C c8050c) throws j3.v;
}
