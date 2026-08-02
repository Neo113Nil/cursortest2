package X5;

import android.graphics.Bitmap;
import com.facebook.react.devsupport.CxxInspectorPackagerConnection;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f13554a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13555b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f13556c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f13557d;

    /* renamed from: e, reason: collision with root package name */
    public long f13558e;

    /* renamed from: X5.a$a, reason: collision with other inner class name */
    public static final class C0278a {

        /* renamed from: a, reason: collision with root package name */
        public final int f13559a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13560b;

        public C0278a(int i10, int i11) {
            this.f13559a = i10;
            this.f13560b = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0278a)) {
                return false;
            }
            C0278a c0278a = (C0278a) obj;
            return this.f13559a == c0278a.f13559a && this.f13560b == c0278a.f13560b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f13559a) * 31) + Integer.hashCode(this.f13560b);
        }

        public String toString() {
            return "Key(w=" + this.f13559a + ", h=" + this.f13560b + ")";
        }
    }

    public a(int i10, long j10) {
        this.f13554a = i10;
        this.f13555b = j10;
        this.f13556c = new ReentrantLock();
        this.f13557d = new HashMap();
    }

    public final Bitmap a(int i10, int i11) {
        ReentrantLock reentrantLock = this.f13556c;
        reentrantLock.lock();
        Bitmap bitmap = null;
        if (i10 <= 0 || i11 <= 0) {
            return null;
        }
        try {
            ArrayDeque arrayDeque = (ArrayDeque) this.f13557d.get(new C0278a(i10, i11));
            while (arrayDeque != null && !arrayDeque.isEmpty()) {
                Bitmap bitmap2 = (Bitmap) arrayDeque.removeFirst();
                if (!bitmap2.isRecycled() && bitmap2.getWidth() == i10 && bitmap2.getHeight() == i11) {
                    this.f13558e -= bitmap2.getAllocationByteCount();
                    bitmap2.eraseColor(0);
                    return bitmap2;
                }
                Intrinsics.checkNotNull(bitmap2);
                d(bitmap2);
            }
            try {
                bitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            } catch (Throwable unused) {
            }
            return bitmap;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b() {
        ReentrantLock reentrantLock = this.f13556c;
        reentrantLock.lock();
        try {
            Collection<ArrayDeque> values = this.f13557d.values();
            Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
            for (ArrayDeque arrayDeque : values) {
                while (true) {
                    Intrinsics.checkNotNull(arrayDeque);
                    if (!arrayDeque.isEmpty()) {
                        Object removeFirst = arrayDeque.removeFirst();
                        Intrinsics.checkNotNullExpressionValue(removeFirst, "removeFirst(...)");
                        d((Bitmap) removeFirst);
                    }
                }
            }
            this.f13557d.clear();
            this.f13558e = 0L;
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void c(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ReentrantLock reentrantLock = this.f13556c;
        reentrantLock.lock();
        try {
            if (bitmap.isRecycled()) {
                reentrantLock.unlock();
                return;
            }
            C0278a c0278a = new C0278a(bitmap.getWidth(), bitmap.getHeight());
            HashMap hashMap = this.f13557d;
            Object obj = hashMap.get(c0278a);
            if (obj == null) {
                obj = new ArrayDeque();
                hashMap.put(c0278a, obj);
            }
            ArrayDeque arrayDeque = (ArrayDeque) obj;
            if (arrayDeque.size() >= this.f13554a) {
                d(bitmap);
                reentrantLock.unlock();
                return;
            }
            arrayDeque.addLast(bitmap);
            this.f13558e += bitmap.getAllocationByteCount();
            e(this.f13555b);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void d(Bitmap bitmap) {
        try {
            if (bitmap.isRecycled()) {
                return;
            }
            bitmap.recycle();
        } catch (Throwable unused) {
        }
    }

    public final void e(long j10) {
        if (this.f13558e <= j10) {
            return;
        }
        Set entrySet = this.f13557d.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
        for (Object obj : CollectionsKt.toList(entrySet)) {
            Intrinsics.checkNotNullExpressionValue(obj, "next(...)");
            Object value = ((Map.Entry) obj).getValue();
            Intrinsics.checkNotNullExpressionValue(value, "component2(...)");
            ArrayDeque arrayDeque = (ArrayDeque) value;
            while (!arrayDeque.isEmpty() && this.f13558e > j10) {
                Bitmap bitmap = (Bitmap) arrayDeque.removeLast();
                this.f13558e -= bitmap.getAllocationByteCount();
                Intrinsics.checkNotNull(bitmap);
                d(bitmap);
            }
        }
        Iterator it = this.f13557d.entrySet().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            if (((ArrayDeque) ((Map.Entry) next).getValue()).isEmpty()) {
                it.remove();
            }
        }
    }

    public /* synthetic */ a(int i10, long j10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 2 : i10, (i11 & 2) != 0 ? CxxInspectorPackagerConnection.MAX_QUEUE_SIZE : j10);
    }
}
