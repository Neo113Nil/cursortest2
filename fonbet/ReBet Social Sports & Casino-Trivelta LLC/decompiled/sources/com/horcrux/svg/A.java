package com.horcrux.svg;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class A {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f38623a;

    /* renamed from: b, reason: collision with root package name */
    public final int[][] f38624b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f38625c;

    public A(Paint paint) {
        ArrayList arrayList = new ArrayList();
        this.f38623a = arrayList;
        this.f38624b = new int[256][];
        this.f38625c = paint;
        arrayList.add(new Path());
    }

    public final int a(char c10) {
        int[] iArr = this.f38624b[c10 >> '\b'];
        if (iArr == null) {
            return 0;
        }
        return iArr[c10 & 255];
    }

    public Path b(char c10, String str) {
        Path path;
        int a10 = a(c10);
        if (a10 != 0) {
            path = (Path) this.f38623a.get(a10);
        } else {
            Path path2 = new Path();
            this.f38625c.getTextPath(str, 0, 1, 0.0f, 0.0f, path2);
            int[][] iArr = this.f38624b;
            int i10 = c10 >> '\b';
            int[] iArr2 = iArr[i10];
            if (iArr2 == null) {
                iArr2 = new int[256];
                iArr[i10] = iArr2;
            }
            iArr2[c10 & 255] = this.f38623a.size();
            this.f38623a.add(path2);
            path = path2;
        }
        Path path3 = new Path();
        path3.addPath(path);
        return path3;
    }
}
