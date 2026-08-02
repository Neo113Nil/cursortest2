package x1;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import k1.C7459e;
import org.jetbrains.annotations.NotNull;

/* renamed from: x1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10634i {

    /* renamed from: a, reason: collision with root package name */
    private long f104879a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final SparseLongArray f104880b = new SparseLongArray();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final SparseBooleanArray f104881c = new SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayList f104882d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private int f104883e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f104884f = -1;

    /* JADX WARN: Removed duplicated region for block: B:50:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final z a(@NotNull MotionEvent motionEvent, @NotNull AndroidComposeView androidComposeView) {
        long j11;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        long j12;
        long j13;
        long w02;
        long a11;
        long P02;
        int toolType;
        int i13;
        int historySize;
        int i14;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f104880b;
        SparseBooleanArray sparseBooleanArray = this.f104881c;
        int i15 = 3;
        if (actionMasked == 3 || actionMasked == 4) {
            sparseLongArray.clear();
            sparseBooleanArray.clear();
            return null;
        }
        if (motionEvent.getPointerCount() == 1) {
            int toolType2 = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType2 != this.f104883e || source != this.f104884f) {
                this.f104883e = toolType2;
                this.f104884f = source;
                sparseBooleanArray.clear();
                sparseLongArray.clear();
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0 || actionMasked2 == 5) {
            j11 = 1;
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j14 = this.f104879a;
                this.f104879a = j14 + 1;
                sparseLongArray.put(pointerId, j14);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    sparseBooleanArray.put(pointerId, true);
                }
            }
        } else {
            if (actionMasked2 == 9) {
                int pointerId2 = motionEvent.getPointerId(0);
                if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                    long j15 = this.f104879a;
                    j11 = 1;
                    this.f104879a = j15 + 1;
                    sparseLongArray.put(pointerId2, j15);
                }
            }
            j11 = 1;
        }
        boolean z13 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z14 = actionMasked == 8;
        if (z13) {
            i11 = 1;
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        } else {
            i11 = 1;
        }
        int actionIndex2 = actionMasked != i11 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        ArrayList arrayList = this.f104882d;
        arrayList.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i16 = 0;
        while (i16 < pointerCount) {
            boolean z15 = (z13 || i16 == actionIndex2 || (z14 && motionEvent.getButtonState() == 0)) ? false : true;
            int pointerId3 = motionEvent.getPointerId(i16);
            int indexOfKey = sparseLongArray.indexOfKey(pointerId3);
            if (indexOfKey >= 0) {
                z12 = z13;
                z11 = z14;
                j12 = sparseLongArray.valueAt(indexOfKey);
            } else {
                z11 = z14;
                long j16 = this.f104879a;
                z12 = z13;
                this.f104879a = j16 + j11;
                sparseLongArray.put(pointerId3, j16);
                j12 = j16;
            }
            float pressure = motionEvent.getPressure(i16);
            long a12 = P9.a.a(motionEvent.getX(i16), motionEvent.getY(i16));
            long b11 = C7459e.b(a12, 0.0f, i15);
            if (i16 == 0) {
                a11 = P9.a.a(motionEvent.getRawX(), motionEvent.getRawY());
                P02 = androidComposeView.P0(a11);
            } else if (Build.VERSION.SDK_INT >= 29) {
                a11 = C10635j.f104885a.a(motionEvent, i16);
                P02 = androidComposeView.P0(a11);
            } else {
                j13 = a12;
                w02 = androidComposeView.w0(a12);
                toolType = motionEvent.getToolType(i16);
                if (toolType != 0) {
                    if (toolType == 1) {
                        i13 = 1;
                    } else if (toolType == 2) {
                        i13 = i15;
                    } else if (toolType == i15) {
                        i13 = 2;
                    } else if (toolType == 4) {
                        i13 = 4;
                    }
                    ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    for (i14 = 0; i14 < historySize; i14++) {
                        float historicalX = motionEvent.getHistoricalX(i16, i14);
                        float historicalY = motionEvent.getHistoricalY(i16, i14);
                        if (!Float.isInfinite(historicalX) && !Float.isNaN(historicalX) && !Float.isInfinite(historicalY) && !Float.isNaN(historicalY)) {
                            long a13 = P9.a.a(historicalX, historicalY);
                            arrayList2.add(new C10631f(motionEvent.getHistoricalEventTime(i14), a13, a13));
                        }
                    }
                    arrayList.add(new C10625A(j12, motionEvent.getEventTime(), w02, j13, z15, pressure, i13, sparseBooleanArray.get(motionEvent.getPointerId(i16), false), arrayList2, motionEvent.getActionMasked() == 8 ? P9.a.a(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f) : 0L, b11));
                    i16++;
                    z14 = z11;
                    z13 = z12;
                    i15 = 3;
                }
                i13 = 0;
                ArrayList arrayList22 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                while (i14 < historySize) {
                }
                arrayList.add(new C10625A(j12, motionEvent.getEventTime(), w02, j13, z15, pressure, i13, sparseBooleanArray.get(motionEvent.getPointerId(i16), false), arrayList22, motionEvent.getActionMasked() == 8 ? P9.a.a(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f) : 0L, b11));
                i16++;
                z14 = z11;
                z13 = z12;
                i15 = 3;
            }
            w02 = a11;
            j13 = P02;
            toolType = motionEvent.getToolType(i16);
            if (toolType != 0) {
            }
            i13 = 0;
            ArrayList arrayList222 = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            while (i14 < historySize) {
            }
            arrayList.add(new C10625A(j12, motionEvent.getEventTime(), w02, j13, z15, pressure, i13, sparseBooleanArray.get(motionEvent.getPointerId(i16), false), arrayList222, motionEvent.getActionMasked() == 8 ? P9.a.a(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f) : 0L, b11));
            i16++;
            z14 = z11;
            z13 = z12;
            i15 = 3;
        }
        int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 == 1 || actionMasked3 == 6) {
            int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
            i12 = 0;
            if (!sparseBooleanArray.get(pointerId4, false)) {
                sparseLongArray.delete(pointerId4);
                sparseBooleanArray.delete(pointerId4);
            }
        } else {
            i12 = 0;
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int keyAt = sparseLongArray.keyAt(size);
                int pointerCount2 = motionEvent.getPointerCount();
                int i17 = i12;
                while (true) {
                    if (i17 >= pointerCount2) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(keyAt);
                        break;
                    }
                    if (motionEvent.getPointerId(i17) == keyAt) {
                        break;
                    }
                    i17++;
                }
            }
        }
        motionEvent.getEventTime();
        return new z(arrayList, motionEvent);
    }

    public final void b(int i11) {
        this.f104881c.delete(i11);
        this.f104880b.delete(i11);
    }
}
