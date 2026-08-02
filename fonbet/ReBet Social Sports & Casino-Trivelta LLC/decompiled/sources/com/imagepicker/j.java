package com.imagepicker;

import android.text.TextUtils;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import java.util.function.Function;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public int f39024a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f39025b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f39026c;

    /* renamed from: d, reason: collision with root package name */
    public int f39027d;

    /* renamed from: e, reason: collision with root package name */
    public int f39028e;

    /* renamed from: f, reason: collision with root package name */
    public int f39029f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f39030g;

    /* renamed from: h, reason: collision with root package name */
    public int f39031h;

    /* renamed from: i, reason: collision with root package name */
    public int f39032i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f39033j;

    /* renamed from: k, reason: collision with root package name */
    public int f39034k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f39035l;

    /* renamed from: m, reason: collision with root package name */
    public String f39036m;
    String[] restrictMimeTypes;

    public j(ReadableMap readableMap) {
        this.f39027d = 1;
        this.f39029f = 92;
        Boolean bool = Boolean.TRUE;
        this.f39030g = bool;
        Boolean bool2 = Boolean.FALSE;
        this.f39035l = bool2;
        this.f39036m = readableMap.getString("mediaType");
        this.restrictMimeTypes = (String[]) readableMap.getArray("restrictMimeTypes").toArrayList().stream().map(new Function() { // from class: com.imagepicker.h
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return obj.toString();
            }
        }).toArray(new IntFunction() { // from class: com.imagepicker.i
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return j.a(i10);
            }
        });
        this.f39024a = readableMap.getInt("selectionLimit");
        this.f39025b = Boolean.valueOf(readableMap.getBoolean("includeBase64"));
        this.f39026c = Boolean.valueOf(readableMap.getBoolean("includeExtra"));
        String string = readableMap.getString("videoQuality");
        if (!TextUtils.isEmpty(string) && !string.toLowerCase().equals("high")) {
            this.f39027d = 0;
        }
        if (readableMap.hasKey("conversionQuality")) {
            this.f39029f = (int) (readableMap.getDouble("conversionQuality") * 100.0d);
        }
        String string2 = readableMap.getString("assetRepresentationMode");
        if (!TextUtils.isEmpty(string2) && string2.toLowerCase().equals("current")) {
            this.f39030g = bool2;
        }
        if (readableMap.getString("cameraType").equals("front")) {
            this.f39035l = bool;
        }
        this.f39028e = (int) (readableMap.getDouble("quality") * 100.0d);
        this.f39032i = readableMap.getInt(ViewProps.MAX_HEIGHT);
        this.f39031h = readableMap.getInt(ViewProps.MAX_WIDTH);
        this.f39033j = Boolean.valueOf(readableMap.getBoolean("saveToPhotos"));
        this.f39034k = readableMap.getInt("durationLimit");
    }

    public static /* synthetic */ String[] a(int i10) {
        return new String[i10];
    }
}
