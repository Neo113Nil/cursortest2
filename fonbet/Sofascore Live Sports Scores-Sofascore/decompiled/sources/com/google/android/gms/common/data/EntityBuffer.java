package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.a70;
import defpackage.fn0;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {
    public boolean b;
    public ArrayList c;

    public EntityBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.b = false;
    }

    public abstract Object e(int i, int i2);

    @Override // com.google.android.gms.common.data.DataBuffer
    public final Object get(int i) {
        int intValue;
        int intValue2;
        n();
        int m = m(i);
        int i2 = 0;
        if (i >= 0 && i != this.c.size()) {
            int size = this.c.size() - 1;
            DataHolder dataHolder = this.a;
            if (i == size) {
                Preconditions.i(dataHolder);
                intValue = dataHolder.h;
                intValue2 = ((Integer) this.c.get(i)).intValue();
            } else {
                intValue = ((Integer) this.c.get(i + 1)).intValue();
                intValue2 = ((Integer) this.c.get(i)).intValue();
            }
            i2 = intValue - intValue2;
            if (i2 == 1) {
                int m2 = m(i);
                Preconditions.i(dataHolder);
                dataHolder.Y0(m2);
                i2 = 1;
            }
        }
        return e(m, i2);
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public final int getCount() {
        n();
        return this.c.size();
    }

    public final int m(int i) {
        if (i >= 0 && i < this.c.size()) {
            return ((Integer) this.c.get(i)).intValue();
        }
        a70.p(fn0.k(i, "Position ", " is out of bounds for this buffer", new StringBuilder(String.valueOf(i).length() + 42)));
        return 0;
    }

    public final void n() {
        synchronized (this) {
            try {
                if (!this.b) {
                    DataHolder dataHolder = this.a;
                    Preconditions.i(dataHolder);
                    int i = dataHolder.h;
                    ArrayList arrayList = new ArrayList();
                    this.c = arrayList;
                    if (i > 0) {
                        arrayList.add(0);
                        int Y0 = this.a.Y0(0);
                        DataHolder dataHolder2 = this.a;
                        dataHolder2.Z0(0, "path");
                        String string = dataHolder2.d[Y0].getString(0, dataHolder2.c.getInt("path"));
                        for (int i2 = 1; i2 < i; i2++) {
                            int Y02 = this.a.Y0(i2);
                            DataHolder dataHolder3 = this.a;
                            dataHolder3.Z0(i2, "path");
                            String string2 = dataHolder3.d[Y02].getString(i2, dataHolder3.c.getInt("path"));
                            if (string2 == null) {
                                StringBuilder sb = new StringBuilder("path".length() + 42 + String.valueOf(i2).length() + 14 + String.valueOf(Y02).length());
                                sb.append("Missing value for markerColumn: ");
                                sb.append("path");
                                sb.append(", at row: ");
                                sb.append(i2);
                                sb.append(", for window: ");
                                sb.append(Y02);
                                throw new NullPointerException(sb.toString());
                            }
                            if (!string2.equals(string)) {
                                this.c.add(Integer.valueOf(i2));
                                string = string2;
                            }
                        }
                    }
                    this.b = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
