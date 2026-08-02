package com.imagepicker;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;

/* loaded from: classes3.dex */
public class m extends g {

    /* renamed from: d, reason: collision with root package name */
    public int f39044d;

    /* renamed from: e, reason: collision with root package name */
    public int f39045e;

    public m(Uri uri, Context context) {
        try {
            a aVar = new a();
            try {
                aVar.setDataSource(context, uri);
                String extractMetadata = aVar.extractMetadata(9);
                String extractMetadata2 = aVar.extractMetadata(20);
                String extractMetadata3 = aVar.extractMetadata(5);
                if (extractMetadata != null) {
                    this.f39044d = Math.round(Float.parseFloat(extractMetadata)) / 1000;
                }
                if (extractMetadata2 != null) {
                    this.f39045e = Integer.parseInt(extractMetadata2);
                }
                int i10 = 0;
                if (extractMetadata3 != null) {
                    this.f39021a = a(extractMetadata3.substring(0, extractMetadata3.indexOf(".")) + "+GMT", "yyyyMMdd'T'HHmmss+zzz");
                }
                String extractMetadata4 = aVar.extractMetadata(18);
                String extractMetadata5 = aVar.extractMetadata(19);
                if (extractMetadata5 != null && extractMetadata4 != null) {
                    String extractMetadata6 = aVar.extractMetadata(24);
                    if (extractMetadata6 != null) {
                        i10 = Integer.parseInt(extractMetadata6);
                    }
                    if (i10 != 90 && i10 != 270) {
                        this.f39023c = Integer.parseInt(extractMetadata4);
                        this.f39022b = Integer.parseInt(extractMetadata5);
                    }
                    this.f39023c = Integer.parseInt(extractMetadata5);
                    this.f39022b = Integer.parseInt(extractMetadata4);
                }
                aVar.close();
            } finally {
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public int b() {
        return this.f39045e;
    }

    public String c() {
        return this.f39021a;
    }

    public int d() {
        return this.f39044d;
    }

    public int e() {
        return this.f39022b;
    }

    public int f() {
        return this.f39023c;
    }
}
