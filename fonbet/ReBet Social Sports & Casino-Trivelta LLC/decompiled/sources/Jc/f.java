package Jc;

import Ic.AbstractC1350d;
import Ic.q;
import Jc.k;
import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements Ic.e {

    /* renamed from: d, reason: collision with root package name */
    public static final a f6105d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f6106a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f6107b = new SparseArray();

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f6108c = new SparseArray();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @Override // Ic.e
    public boolean a(AbstractC1350d handler, AbstractC1350d otherHandler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(otherHandler, "otherHandler");
        int[] iArr = (int[]) this.f6106a.get(handler.T());
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == otherHandler.T()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Ic.e
    public boolean b(AbstractC1350d handler, AbstractC1350d otherHandler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(otherHandler, "otherHandler");
        int[] iArr = (int[]) this.f6108c.get(handler.T());
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == otherHandler.T()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Ic.e
    public boolean c(AbstractC1350d handler, AbstractC1350d otherHandler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(otherHandler, "otherHandler");
        int[] iArr = (int[]) this.f6107b.get(handler.T());
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == otherHandler.T()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Ic.e
    public boolean d(AbstractC1350d handler, AbstractC1350d otherHandler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(otherHandler, "otherHandler");
        return otherHandler instanceof q ? ((q) otherHandler).X0() : otherHandler instanceof k.b;
    }

    public final void e(AbstractC1350d handler, ReadableMap config) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(config, "config");
        handler.A0(this);
        if (config.hasKey("waitFor")) {
            this.f6106a.put(handler.T(), f(config, "waitFor"));
        }
        if (config.hasKey("simultaneousHandlers")) {
            this.f6107b.put(handler.T(), f(config, "simultaneousHandlers"));
        }
        if (config.hasKey("blocksHandlers")) {
            this.f6108c.put(handler.T(), f(config, "blocksHandlers"));
        }
    }

    public final int[] f(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        Intrinsics.checkNotNull(array);
        int size = array.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = array.getInt(i10);
        }
        return iArr;
    }

    public final void g(int i10) {
        this.f6106a.remove(i10);
        this.f6107b.remove(i10);
        this.f6108c.remove(i10);
    }

    public final void h() {
        this.f6106a.clear();
        this.f6107b.clear();
        this.f6108c.clear();
    }
}
