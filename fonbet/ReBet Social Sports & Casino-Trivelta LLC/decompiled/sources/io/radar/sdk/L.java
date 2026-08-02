package io.radar.sdk;

import android.app.PendingIntent;
import android.content.Intent;
import android.location.Location;
import io.radar.sdk.C4589c;
import io.radar.sdk.N0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class L {
    public abstract void a(a[] aVarArr, b bVar, PendingIntent pendingIntent, Function1 function1);

    public abstract void b(N0.b bVar, Function1 function1);

    public abstract void c(Function1 function1);

    public abstract Location d(Intent intent);

    public abstract Location e(Intent intent);

    public abstract C4589c.EnumC4597i f(Intent intent);

    public abstract void g(PendingIntent pendingIntent, Function1 function1);

    public abstract void h(PendingIntent pendingIntent);

    public abstract void i(N0.b bVar, int i10, int i11, PendingIntent pendingIntent);

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f49702a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f49703b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f49704c;

        public b(boolean z10, boolean z11, boolean z12) {
            this.f49702a = z10;
            this.f49703b = z11;
            this.f49704c = z12;
        }

        public final boolean a() {
            return this.f49704c;
        }

        public final boolean b() {
            return this.f49702a;
        }

        public final boolean c() {
            return this.f49703b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f49702a == bVar.f49702a && this.f49703b == bVar.f49703b && this.f49704c == bVar.f49704c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
        public int hashCode() {
            boolean z10 = this.f49702a;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            int i10 = r02 * 31;
            ?? r22 = this.f49703b;
            int i11 = r22;
            if (r22 != 0) {
                i11 = 1;
            }
            int i12 = (i10 + i11) * 31;
            boolean z11 = this.f49704c;
            return i12 + (z11 ? 1 : z11 ? 1 : 0);
        }

        public String toString() {
            return "RadarAbstractGeofenceRequest(initialTriggerEnter=" + this.f49702a + ", initialTriggerExit=" + this.f49703b + ", initialTriggerDwell=" + this.f49704c + ')';
        }

        public /* synthetic */ b(boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12);
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f49694a;

        /* renamed from: b, reason: collision with root package name */
        public final double f49695b;

        /* renamed from: c, reason: collision with root package name */
        public final double f49696c;

        /* renamed from: d, reason: collision with root package name */
        public final float f49697d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f49698e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f49699f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f49700g;

        /* renamed from: h, reason: collision with root package name */
        public final int f49701h;

        public a(String requestId, double d10, double d11, float f10, boolean z10, boolean z11, boolean z12, int i10) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            this.f49694a = requestId;
            this.f49695b = d10;
            this.f49696c = d11;
            this.f49697d = f10;
            this.f49698e = z10;
            this.f49699f = z11;
            this.f49700g = z12;
            this.f49701h = i10;
        }

        public final int a() {
            return this.f49701h;
        }

        public final double b() {
            return this.f49695b;
        }

        public final double c() {
            return this.f49696c;
        }

        public final float d() {
            return this.f49697d;
        }

        public final String e() {
            return this.f49694a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f49694a, aVar.f49694a) && Intrinsics.areEqual((Object) Double.valueOf(this.f49695b), (Object) Double.valueOf(aVar.f49695b)) && Intrinsics.areEqual((Object) Double.valueOf(this.f49696c), (Object) Double.valueOf(aVar.f49696c)) && Intrinsics.areEqual((Object) Float.valueOf(this.f49697d), (Object) Float.valueOf(aVar.f49697d)) && this.f49698e == aVar.f49698e && this.f49699f == aVar.f49699f && this.f49700g == aVar.f49700g && this.f49701h == aVar.f49701h;
        }

        public final boolean f() {
            return this.f49700g;
        }

        public final boolean g() {
            return this.f49698e;
        }

        public final boolean h() {
            return this.f49699f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((((this.f49694a.hashCode() * 31) + Double.hashCode(this.f49695b)) * 31) + Double.hashCode(this.f49696c)) * 31) + Float.hashCode(this.f49697d)) * 31;
            boolean z10 = this.f49698e;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            int i11 = (hashCode + i10) * 31;
            boolean z11 = this.f49699f;
            int i12 = z11;
            if (z11 != 0) {
                i12 = 1;
            }
            int i13 = (i11 + i12) * 31;
            boolean z12 = this.f49700g;
            return ((i13 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + Integer.hashCode(this.f49701h);
        }

        public String toString() {
            return "RadarAbstractGeofence(requestId=" + this.f49694a + ", latitude=" + this.f49695b + ", longitude=" + this.f49696c + ", radius=" + this.f49697d + ", transitionEnter=" + this.f49698e + ", transitionExit=" + this.f49699f + ", transitionDwell=" + this.f49700g + ", dwellDuration=" + this.f49701h + ')';
        }

        public /* synthetic */ a(String str, double d10, double d11, float f10, boolean z10, boolean z11, boolean z12, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, d10, d11, f10, (i11 & 16) != 0 ? false : z10, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? false : z12, (i11 & 128) != 0 ? 0 : i10);
        }
    }
}
