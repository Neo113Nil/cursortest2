package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.GestureDetector;
import android.view.View;
import android.widget.RemoteViews;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.mbridge.msdk.foundation.controller.a;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a02 implements mli {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public final Object d;
    public final Object e;

    public a02(long[] jArr, RemoteViews[] remoteViewsArr) {
        this.a = 3;
        this.d = jArr;
        this.e = remoteViewsArr;
        this.c = false;
        this.b = 1;
        if (jArr.length != remoteViewsArr.length) {
            a70.p("RemoteCollectionItems has different number of ids and views");
            throw null;
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = CollectionsKt.S0(CollectionsKt.V0(arrayList)).size();
        if (size <= 1) {
            return;
        }
        ogj.h(lnb.k(size, "View type count is set to 1, but the collection contains ", " different layout ids"));
        throw null;
    }

    public static a02 c(char c) {
        return new a02(new yia(new dp2(c, 0), 19));
    }

    public static a02 d(String str) {
        z1a.r("The separator may not be the empty string.", str.length() != 0);
        return str.length() == 1 ? c(str.charAt(0)) : new a02(new ih2(str, 4));
    }

    @Override // defpackage.bm4
    public void a(tli tliVar) {
        qx9.t(!this.c);
        qx9.t(this.b == 1);
        qx9.r(((tli) this.d) == tliVar);
        this.b = 2;
    }

    public void b(int i) {
        int i2 = this.a;
        Object obj = this.d;
        Object obj2 = this.e;
        switch (i2) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj2;
                WeakReference weakReference = bottomSheetBehavior.Y;
                if (weakReference != null && weakReference.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) bottomSheetBehavior.Y.get()).postOnAnimation((b8) obj);
                        this.c = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj2;
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) sideSheetBehavior.p.get()).postOnAnimation((t4f) obj);
                        this.c = true;
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.bm4
    public Object dequeueInputBuffer() {
        qx9.t(!this.c);
        if (this.b != 0) {
            return null;
        }
        this.b = 1;
        return (tli) this.d;
    }

    @Override // defpackage.bm4
    public Object dequeueOutputBuffer() {
        ArrayDeque arrayDeque = (ArrayDeque) this.e;
        tli tliVar = (tli) this.d;
        qx9.t(!this.c);
        if (this.b != 2 || arrayDeque.isEmpty()) {
            return null;
        }
        sm2 sm2Var = (sm2) arrayDeque.removeFirst();
        int i = 4;
        if (tliVar.i(4)) {
            sm2Var.b(4);
        } else {
            long j = tliVar.j;
            ByteBuffer byteBuffer = tliVar.h;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(array, 0, array.length);
            obtain.setDataPosition(0);
            Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
            obtain.recycle();
            ArrayList parcelableArrayList = readBundle.getParcelableArrayList(a.q);
            parcelableArrayList.getClass();
            sm2Var.B(tliVar.j, new am0(j, j72.A(l74.s, parcelableArrayList), i), 0L);
        }
        tliVar.A();
        this.b = 0;
        return sm2Var;
    }

    public List e(CharSequence charSequence) {
        charSequence.getClass();
        Iterator b = ((qyh) this.e).b(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            pyh pyhVar = (pyh) b;
            if (!pyhVar.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) pyhVar.next());
        }
    }

    @Override // defpackage.bm4
    public void flush() {
        qx9.t(!this.c);
        ((tli) this.d).A();
        this.b = 0;
    }

    @Override // defpackage.bm4
    public void release() {
        this.c = true;
    }

    @Override // defpackage.mli
    public void setPositionUs(long j) {
    }

    public a02() {
        this.a = 1;
        this.d = new tli(1);
        this.e = new ArrayDeque();
        for (int i = 0; i < 2; i++) {
            ((ArrayDeque) this.e).addFirst(new sm2(this, 1));
        }
        this.b = 0;
    }

    public a02(qyh qyhVar, boolean z, ip2 ip2Var, int i) {
        this.a = 5;
        this.e = qyhVar;
        this.c = z;
        this.d = ip2Var;
        this.b = i;
    }

    public a02(Parcel parcel) {
        this.a = 3;
        int readInt = parcel.readInt();
        long[] jArr = new long[readInt];
        this.d = jArr;
        parcel.readLongArray(jArr);
        Parcelable.Creator creator = RemoteViews.CREATOR;
        creator.getClass();
        RemoteViews[] remoteViewsArr = new RemoteViews[readInt];
        parcel.readTypedArray(remoteViewsArr, creator);
        for (int i = 0; i < readInt; i++) {
            if (remoteViewsArr[i] == null) {
                pvd.k(46, remoteViewsArr, "null element found in ");
                throw null;
            }
        }
        this.e = remoteViewsArr;
        this.c = parcel.readInt() == 1;
        this.b = parcel.readInt();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a02(qyh qyhVar) {
        this(qyhVar, false, ap2.f, Integer.MAX_VALUE);
        this.a = 5;
    }

    public a02(SideSheetBehavior sideSheetBehavior) {
        this.a = 4;
        this.e = sideSheetBehavior;
        this.d = new t4f(this, 7);
    }

    public a02(BottomSheetBehavior bottomSheetBehavior) {
        this.a = 0;
        this.e = bottomSheetBehavior;
        this.d = new b8(this, 6);
    }

    public a02(Context context, sy syVar) {
        this.a = 2;
        this.d = syVar;
        this.b = 0;
        this.e = new GestureDetector(context, new b2a(this));
    }
}
