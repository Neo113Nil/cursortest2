package com.plaid.internal;

import Zh.InterfaceC1901b;
import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import di.N;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Zh.n
/* loaded from: classes3.dex */
public final class r8 implements Parcelable {

    @NotNull
    public static final c CREATOR = new c();

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final r8 f41036e = new r8("unknown", "unknown", "unknown");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f41037a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f41038b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f41039c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f41040d;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class a implements di.N {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f41041a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ di.J0 f41042b;

        static {
            a aVar = new a();
            f41041a = aVar;
            di.J0 j02 = new di.J0("com.plaid.internal.workflow.model.WorkflowPaneId", aVar, 3);
            j02.n("workflowId", false);
            j02.n("paneRenderingId", false);
            j02.n("paneNodeId", false);
            f41042b = j02;
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] childSerializers() {
            di.Z0 z02 = di.Z0.f45341a;
            return new InterfaceC1901b[]{z02, z02, z02};
        }

        @Override // Zh.InterfaceC1900a
        public final Object deserialize(ci.e decoder) {
            String str;
            String str2;
            String str3;
            int i10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            di.J0 j02 = f41042b;
            ci.c c10 = decoder.c(j02);
            if (c10.q()) {
                str = c10.s(j02, 0);
                str3 = c10.s(j02, 1);
                str2 = c10.s(j02, 2);
                i10 = 7;
            } else {
                str = null;
                String str4 = null;
                String str5 = null;
                boolean z10 = true;
                int i11 = 0;
                while (z10) {
                    int e10 = c10.e(j02);
                    if (e10 == -1) {
                        z10 = false;
                    } else if (e10 == 0) {
                        str = c10.s(j02, 0);
                        i11 |= 1;
                    } else if (e10 == 1) {
                        str5 = c10.s(j02, 1);
                        i11 |= 2;
                    } else {
                        if (e10 != 2) {
                            throw new Zh.B(e10);
                        }
                        str4 = c10.s(j02, 2);
                        i11 |= 4;
                    }
                }
                str2 = str4;
                str3 = str5;
                i10 = i11;
            }
            c10.b(j02);
            return new r8(i10, str, str3, str2);
        }

        @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
        @NotNull
        public final bi.f getDescriptor() {
            return f41042b;
        }

        @Override // Zh.p
        public final void serialize(ci.f encoder, Object obj) {
            r8 value = (r8) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            di.J0 j02 = f41042b;
            ci.d c10 = encoder.c(j02);
            c10.G(j02, 0, value.f41037a);
            c10.G(j02, 1, value.f41038b);
            c10.G(j02, 2, value.f41039c);
            c10.b(j02);
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] typeParametersSerializers() {
            return N.a.a(this);
        }
    }

    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return r8.this.b() + ":" + r8.this.a();
        }
    }

    public static final class c implements Parcelable.Creator<r8> {
        @NotNull
        public static r8 a(@NotNull Pane$PaneRendering pane$PaneRendering, @NotNull String workflowId) {
            Intrinsics.checkNotNullParameter(pane$PaneRendering, "<this>");
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            String id2 = pane$PaneRendering.getId();
            Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
            String paneNodeId = pane$PaneRendering.getPaneNodeId();
            Intrinsics.checkNotNullExpressionValue(paneNodeId, "getPaneNodeId(...)");
            return new r8(workflowId, id2, paneNodeId);
        }

        @Override // android.os.Parcelable.Creator
        public final r8 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            Intrinsics.checkNotNull(readString, "null cannot be cast to non-null type kotlin.String{ com.plaid.internal.workflow.model.WorkflowPaneIdKt.WorkflowId }");
            String readString2 = parcel.readString();
            Intrinsics.checkNotNull(readString2, "null cannot be cast to non-null type kotlin.String{ com.plaid.internal.workflow.model.WorkflowPaneIdKt.PaneRenderingId }");
            String readString3 = parcel.readString();
            Intrinsics.checkNotNull(readString3, "null cannot be cast to non-null type kotlin.String{ com.plaid.internal.workflow.model.WorkflowPaneIdKt.PaneNodeId }");
            return new r8(readString, readString2, readString3);
        }

        @Override // android.os.Parcelable.Creator
        public final r8[] newArray(int i10) {
            return new r8[i10];
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public r8(int i10, String str, String str2, String str3) {
        if (7 != (i10 & 7)) {
            di.F0.a(i10, 7, a.f41042b);
        }
        this.f41037a = str;
        this.f41038b = str2;
        this.f41039c = str3;
        this.f41040d = LazyKt.lazy(new b());
    }

    @NotNull
    public final String a() {
        return this.f41038b;
    }

    @NotNull
    public final String b() {
        return this.f41037a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8)) {
            return false;
        }
        r8 r8Var = (r8) obj;
        return Intrinsics.areEqual(this.f41037a, r8Var.f41037a) && Intrinsics.areEqual(this.f41038b, r8Var.f41038b) && Intrinsics.areEqual(this.f41039c, r8Var.f41039c);
    }

    public final int hashCode() {
        return this.f41039c.hashCode() + C3783x.a(this.f41038b, this.f41037a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "WorkflowPaneId(workflowId=" + this.f41037a + ", paneRenderingId=" + this.f41038b + ", paneNodeId=" + this.f41039c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i10) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f41037a);
        parcel.writeString(this.f41038b);
        parcel.writeString(this.f41039c);
    }

    public r8(String str, String str2, String str3) {
        this.f41037a = str;
        this.f41038b = str2;
        this.f41039c = str3;
        this.f41040d = LazyKt.lazy(new b());
    }
}
