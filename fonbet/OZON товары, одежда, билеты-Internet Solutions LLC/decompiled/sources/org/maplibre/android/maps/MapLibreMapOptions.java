package org.maplibre.android.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.core.content.res.g;
import io.sentry.W2;
import java.util.Arrays;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.e;
import org.maplibre.android.utils.a;
import org.maplibre.android.utils.d;

/* loaded from: classes10.dex */
public class MapLibreMapOptions implements Parcelable {
    public static final Parcelable.Creator<MapLibreMapOptions> CREATOR = new Parcelable.Creator<MapLibreMapOptions>() { // from class: org.maplibre.android.maps.MapLibreMapOptions.1
        @Override // android.os.Parcelable.Creator
        public final MapLibreMapOptions createFromParcel(@NonNull Parcel parcel) {
            return new MapLibreMapOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MapLibreMapOptions[] newArray(int i11) {
            return new MapLibreMapOptions[i11];
        }
    };

    /* renamed from: A, reason: collision with root package name */
    private int f79748A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f79749B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f79750C;

    /* renamed from: D, reason: collision with root package name */
    private String f79751D;

    /* renamed from: E, reason: collision with root package name */
    private String[] f79752E;

    /* renamed from: F, reason: collision with root package name */
    private String f79753F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f79754G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f79755H;

    /* renamed from: I, reason: collision with root package name */
    private int f79756I;

    /* renamed from: J, reason: collision with root package name */
    private float f79757J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f79758K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f79759L;

    /* renamed from: M, reason: collision with root package name */
    private String f79760M;

    /* renamed from: N, reason: collision with root package name */
    private long f79761N;

    /* renamed from: O, reason: collision with root package name */
    private long f79762O;

    /* renamed from: P, reason: collision with root package name */
    private int f79763P;

    /* renamed from: a, reason: collision with root package name */
    private CameraPosition f79764a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f79765b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f79766c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f79767d;

    /* renamed from: e, reason: collision with root package name */
    private int f79768e;

    /* renamed from: f, reason: collision with root package name */
    private int[] f79769f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f79770g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f79771h;

    /* renamed from: i, reason: collision with root package name */
    private int f79772i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f79773j;

    /* renamed from: k, reason: collision with root package name */
    private int f79774k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f79775l;

    /* renamed from: m, reason: collision with root package name */
    private int f79776m;

    /* renamed from: n, reason: collision with root package name */
    private int[] f79777n;

    /* renamed from: o, reason: collision with root package name */
    private double f79778o;

    /* renamed from: p, reason: collision with root package name */
    private double f79779p;

    /* renamed from: q, reason: collision with root package name */
    private double f79780q;

    /* renamed from: r, reason: collision with root package name */
    private double f79781r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f79782s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f79783t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f79784u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f79785v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f79786w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f79787x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f79788y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f79789z;

    @Deprecated
    public MapLibreMapOptions() {
        this.f79766c = true;
        this.f79767d = true;
        this.f79768e = 8388661;
        this.f79771h = true;
        this.f79772i = 8388691;
        this.f79774k = -1;
        this.f79775l = true;
        this.f79776m = 8388691;
        this.f79778o = 0.0d;
        this.f79779p = 25.5d;
        this.f79780q = 0.0d;
        this.f79781r = 60.0d;
        this.f79782s = true;
        this.f79783t = true;
        this.f79784u = true;
        this.f79785v = true;
        this.f79786w = true;
        this.f79787x = true;
        this.f79788y = true;
        this.f79789z = true;
        this.f79748A = 4;
        this.f79749B = false;
        this.f79750C = true;
        this.f79758K = true;
        this.f79759L = false;
        this.f79760M = "";
        this.f79761N = W2.MAX_EVENT_SIZE_BYTES;
        this.f79762O = 5L;
        this.f79763P = 60;
    }

    @NonNull
    public static MapLibreMapOptions c(@NonNull Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.f79623b, 0, 0);
        MapLibreMapOptions mapLibreMapOptions = new MapLibreMapOptions();
        float f7 = context.getResources().getDisplayMetrics().density;
        mapLibreMapOptions.f79760M = context.getFilesDir().getAbsolutePath();
        try {
            mapLibreMapOptions.f79764a = new CameraPosition.a(obtainStyledAttributes).b();
            mapLibreMapOptions.f79753F = obtainStyledAttributes.getString(5);
            String string = obtainStyledAttributes.getString(4);
            if (!TextUtils.isEmpty(string)) {
                mapLibreMapOptions.f79753F = string;
            }
            mapLibreMapOptions.f79786w = obtainStyledAttributes.getBoolean(56, true);
            mapLibreMapOptions.f79783t = obtainStyledAttributes.getBoolean(54, true);
            mapLibreMapOptions.f79784u = obtainStyledAttributes.getBoolean(45, true);
            mapLibreMapOptions.f79782s = obtainStyledAttributes.getBoolean(53, true);
            mapLibreMapOptions.f79785v = obtainStyledAttributes.getBoolean(55, true);
            mapLibreMapOptions.f79787x = obtainStyledAttributes.getBoolean(44, true);
            mapLibreMapOptions.f79788y = obtainStyledAttributes.getBoolean(52, true);
            mapLibreMapOptions.f79779p = obtainStyledAttributes.getFloat(16, 25.5f);
            mapLibreMapOptions.f79778o = obtainStyledAttributes.getFloat(17, 0.0f);
            mapLibreMapOptions.f79781r = obtainStyledAttributes.getFloat(9, 60.0f);
            mapLibreMapOptions.f79780q = obtainStyledAttributes.getFloat(10, 0.0f);
            mapLibreMapOptions.f79766c = obtainStyledAttributes.getBoolean(36, true);
            mapLibreMapOptions.f79768e = obtainStyledAttributes.getInt(39, 8388661);
            float f11 = 4.0f * f7;
            mapLibreMapOptions.f79769f = new int[]{(int) obtainStyledAttributes.getDimension(41, f11), (int) obtainStyledAttributes.getDimension(43, f11), (int) obtainStyledAttributes.getDimension(42, f11), (int) obtainStyledAttributes.getDimension(40, f11)};
            mapLibreMapOptions.f79767d = obtainStyledAttributes.getBoolean(38, true);
            Drawable drawable = obtainStyledAttributes.getDrawable(37);
            if (drawable == null) {
                drawable = g.d(context.getResources(), 2131235757, null);
            }
            mapLibreMapOptions.f79770g = drawable;
            mapLibreMapOptions.f79771h = obtainStyledAttributes.getBoolean(46, true);
            mapLibreMapOptions.f79772i = obtainStyledAttributes.getInt(47, 8388691);
            mapLibreMapOptions.f79773j = new int[]{(int) obtainStyledAttributes.getDimension(49, f11), (int) obtainStyledAttributes.getDimension(51, f11), (int) obtainStyledAttributes.getDimension(50, f11), (int) obtainStyledAttributes.getDimension(48, f11)};
            mapLibreMapOptions.f79774k = obtainStyledAttributes.getColor(35, -1);
            mapLibreMapOptions.f79775l = obtainStyledAttributes.getBoolean(29, true);
            mapLibreMapOptions.f79776m = obtainStyledAttributes.getInt(30, 8388691);
            mapLibreMapOptions.f79777n = new int[]{(int) obtainStyledAttributes.getDimension(32, f7 * 92.0f), (int) obtainStyledAttributes.getDimension(34, f11), (int) obtainStyledAttributes.getDimension(33, f11), (int) obtainStyledAttributes.getDimension(31, f11)};
            mapLibreMapOptions.f79754G = obtainStyledAttributes.getBoolean(27, false);
            mapLibreMapOptions.f79755H = obtainStyledAttributes.getBoolean(28, false);
            mapLibreMapOptions.f79789z = obtainStyledAttributes.getBoolean(19, true);
            mapLibreMapOptions.f79748A = obtainStyledAttributes.getInt(26, 4);
            mapLibreMapOptions.f79749B = obtainStyledAttributes.getBoolean(20, false);
            mapLibreMapOptions.f79750C = obtainStyledAttributes.getBoolean(22, true);
            int resourceId = obtainStyledAttributes.getResourceId(23, 0);
            if (resourceId != 0) {
                mapLibreMapOptions.f79751D = d.a(context.getResources().getStringArray(resourceId));
            } else {
                String string2 = obtainStyledAttributes.getString(24);
                if (string2 == null) {
                    string2 = "sans-serif";
                }
                mapLibreMapOptions.f79751D = d.a(string2);
            }
            mapLibreMapOptions.f79757J = obtainStyledAttributes.getFloat(25, 0.0f);
            mapLibreMapOptions.f79756I = obtainStyledAttributes.getInt(21, -988703);
            mapLibreMapOptions.f79758K = obtainStyledAttributes.getBoolean(18, true);
            mapLibreMapOptions.f79759L = obtainStyledAttributes.getBoolean(0, false);
            mapLibreMapOptions.f79761N = obtainStyledAttributes.getInteger(2, 1048576);
            mapLibreMapOptions.f79762O = obtainStyledAttributes.getInteger(1, 5);
            mapLibreMapOptions.f79763P = obtainStyledAttributes.getInteger(3, 60);
            obtainStyledAttributes.recycle();
            return mapLibreMapOptions;
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final boolean A() {
        return this.f79784u;
    }

    public final String C() {
        if (this.f79750C) {
            return this.f79751D;
        }
        return null;
    }

    public final boolean D() {
        return this.f79771h;
    }

    public final int E() {
        return this.f79772i;
    }

    public final int[] F() {
        return this.f79773j;
    }

    public final double G() {
        return this.f79781r;
    }

    public final double H() {
        return this.f79779p;
    }

    public final double J() {
        return this.f79780q;
    }

    public final double K() {
        return this.f79778o;
    }

    public final int M() {
        return this.f79748A;
    }

    @Deprecated
    public final boolean N() {
        return this.f79789z;
    }

    public final boolean P() {
        return this.f79788y;
    }

    public final boolean S() {
        return this.f79749B;
    }

    public final boolean T() {
        return this.f79782s;
    }

    public final boolean U() {
        return this.f79783t;
    }

    public final boolean V() {
        return this.f79754G;
    }

    public final boolean Y() {
        return this.f79785v;
    }

    @NonNull
    public final void a(CameraPosition cameraPosition) {
        this.f79764a = cameraPosition;
    }

    public final boolean a0() {
        return this.f79755H;
    }

    @NonNull
    public final void b(Drawable drawable) {
        this.f79770g = drawable;
    }

    public final boolean c0() {
        return this.f79786w;
    }

    public final boolean d() {
        return this.f79759L;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.f79762O;
    }

    @NonNull
    public final void e0(float f7) {
        this.f79757J = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MapLibreMapOptions mapLibreMapOptions = (MapLibreMapOptions) obj;
            if (this.f79765b != mapLibreMapOptions.f79765b || this.f79766c != mapLibreMapOptions.f79766c || this.f79767d != mapLibreMapOptions.f79767d) {
                return false;
            }
            Drawable drawable = this.f79770g;
            if (drawable == null ? mapLibreMapOptions.f79770g != null : !drawable.equals(mapLibreMapOptions.f79770g)) {
                return false;
            }
            if (this.f79768e != mapLibreMapOptions.f79768e || this.f79771h != mapLibreMapOptions.f79771h || this.f79772i != mapLibreMapOptions.f79772i || this.f79774k != mapLibreMapOptions.f79774k || this.f79775l != mapLibreMapOptions.f79775l || this.f79776m != mapLibreMapOptions.f79776m || Double.compare(mapLibreMapOptions.f79778o, this.f79778o) != 0 || Double.compare(mapLibreMapOptions.f79779p, this.f79779p) != 0 || Double.compare(mapLibreMapOptions.f79780q, this.f79780q) != 0 || Double.compare(mapLibreMapOptions.f79781r, this.f79781r) != 0 || this.f79782s != mapLibreMapOptions.f79782s || this.f79783t != mapLibreMapOptions.f79783t || this.f79784u != mapLibreMapOptions.f79784u || this.f79785v != mapLibreMapOptions.f79785v || this.f79786w != mapLibreMapOptions.f79786w || this.f79787x != mapLibreMapOptions.f79787x || this.f79788y != mapLibreMapOptions.f79788y) {
                return false;
            }
            CameraPosition cameraPosition = this.f79764a;
            if (cameraPosition == null ? mapLibreMapOptions.f79764a != null : !cameraPosition.equals(mapLibreMapOptions.f79764a)) {
                return false;
            }
            if (!Arrays.equals(this.f79769f, mapLibreMapOptions.f79769f) || !Arrays.equals(this.f79773j, mapLibreMapOptions.f79773j) || !Arrays.equals(this.f79777n, mapLibreMapOptions.f79777n)) {
                return false;
            }
            String str = this.f79753F;
            if (str == null ? mapLibreMapOptions.f79753F != null : !str.equals(mapLibreMapOptions.f79753F)) {
                return false;
            }
            if (this.f79789z != mapLibreMapOptions.f79789z || this.f79748A != mapLibreMapOptions.f79748A || this.f79749B != mapLibreMapOptions.f79749B || this.f79750C != mapLibreMapOptions.f79750C || !this.f79751D.equals(mapLibreMapOptions.f79751D) || !Arrays.equals(this.f79752E, mapLibreMapOptions.f79752E) || this.f79757J != mapLibreMapOptions.f79757J || this.f79758K != mapLibreMapOptions.f79758K || this.f79759L != mapLibreMapOptions.f79759L) {
                return false;
            }
            this.f79760M.equals(mapLibreMapOptions.f79760M);
        }
        return false;
    }

    public final long f() {
        return this.f79761N;
    }

    @NonNull
    public final void f0() {
        this.f79754G = true;
    }

    public final String g() {
        return this.f79760M;
    }

    public final float getPixelRatio() {
        return this.f79757J;
    }

    public final int h() {
        return this.f79763P;
    }

    public final int hashCode() {
        CameraPosition cameraPosition = this.f79764a;
        int hashCode = (((((((((cameraPosition != null ? cameraPosition.hashCode() : 0) * 31) + (this.f79765b ? 1 : 0)) * 31) + (this.f79766c ? 1 : 0)) * 31) + (this.f79767d ? 1 : 0)) * 31) + this.f79768e) * 31;
        Drawable drawable = this.f79770g;
        int hashCode2 = Arrays.hashCode(this.f79777n) + ((((((((Arrays.hashCode(this.f79773j) + ((((((Arrays.hashCode(this.f79769f) + ((hashCode + (drawable != null ? drawable.hashCode() : 0)) * 31)) * 31) + (this.f79771h ? 1 : 0)) * 31) + this.f79772i) * 31)) * 31) + this.f79774k) * 31) + (this.f79775l ? 1 : 0)) * 31) + this.f79776m) * 31);
        long doubleToLongBits = Double.doubleToLongBits(this.f79778o);
        int i11 = (hashCode2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        long doubleToLongBits2 = Double.doubleToLongBits(this.f79779p);
        int i12 = (i11 * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.f79780q);
        int i13 = (i12 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.f79781r);
        int i14 = ((((((((((((((((i13 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + (this.f79782s ? 1 : 0)) * 31) + (this.f79783t ? 1 : 0)) * 31) + (this.f79784u ? 1 : 0)) * 31) + (this.f79785v ? 1 : 0)) * 31) + (this.f79786w ? 1 : 0)) * 31) + (this.f79787x ? 1 : 0)) * 31) + (this.f79788y ? 1 : 0)) * 31;
        String str = this.f79753F;
        int hashCode3 = (((((((((((((i14 + (str != null ? str.hashCode() : 0)) * 31) + (this.f79754G ? 1 : 0)) * 31) + (this.f79755H ? 1 : 0)) * 31) + (this.f79789z ? 1 : 0)) * 31) + this.f79748A) * 31) + (this.f79749B ? 1 : 0)) * 31) + (this.f79750C ? 1 : 0)) * 31;
        String str2 = this.f79751D;
        int hashCode4 = (((((((((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f79752E)) * 31) + ((int) this.f79757J)) * 31) + (this.f79758K ? 1 : 0)) * 31) + (this.f79759L ? 1 : 0)) * 31;
        String str3 = this.f79760M;
        return ((((((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + ((int) this.f79761N)) * 31) + ((int) this.f79762O)) * 31) + this.f79763P;
    }

    @Deprecated
    public final String i() {
        return this.f79753F;
    }

    public final boolean j() {
        return this.f79775l;
    }

    public final int k() {
        return this.f79776m;
    }

    public final int[] l() {
        return this.f79777n;
    }

    public final int n() {
        return this.f79774k;
    }

    public final CameraPosition o() {
        return this.f79764a;
    }

    public final boolean p() {
        return this.f79766c;
    }

    public final boolean q() {
        return this.f79767d;
    }

    public final int r() {
        return this.f79768e;
    }

    public final Drawable t() {
        return this.f79770g;
    }

    public final int[] u() {
        return this.f79769f;
    }

    public final boolean w() {
        return this.f79758K;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        parcel.writeParcelable(this.f79764a, i11);
        parcel.writeByte(this.f79765b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f79766c ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f79768e);
        parcel.writeIntArray(this.f79769f);
        parcel.writeByte(this.f79767d ? (byte) 1 : (byte) 0);
        Drawable drawable = this.f79770g;
        parcel.writeParcelable(drawable != null ? a.a(drawable) : null, i11);
        parcel.writeByte(this.f79771h ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f79772i);
        parcel.writeIntArray(this.f79773j);
        parcel.writeByte(this.f79775l ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f79776m);
        parcel.writeIntArray(this.f79777n);
        parcel.writeInt(this.f79774k);
        parcel.writeDouble(this.f79778o);
        parcel.writeDouble(this.f79779p);
        parcel.writeDouble(this.f79780q);
        parcel.writeDouble(this.f79781r);
        parcel.writeByte(this.f79782s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f79783t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f79784u ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f79785v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f79786w ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f79787x ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f79788y ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f79753F);
        parcel.writeByte(this.f79754G ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f79755H ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f79789z ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f79748A);
        parcel.writeByte(this.f79749B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f79750C ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f79751D);
        parcel.writeStringArray(this.f79752E);
        parcel.writeFloat(this.f79757J);
        parcel.writeInt(this.f79756I);
        parcel.writeByte(this.f79758K ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f79759L ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f79760M);
        parcel.writeLong(this.f79761N);
        parcel.writeLong(this.f79762O);
        parcel.writeInt(this.f79763P);
    }

    public final boolean x() {
        return this.f79765b;
    }

    public final boolean y() {
        return this.f79787x;
    }

    public final int z() {
        return this.f79756I;
    }

    MapLibreMapOptions(Parcel parcel) {
        this.f79766c = true;
        this.f79767d = true;
        this.f79768e = 8388661;
        this.f79771h = true;
        this.f79772i = 8388691;
        this.f79774k = -1;
        this.f79775l = true;
        this.f79776m = 8388691;
        this.f79778o = 0.0d;
        this.f79779p = 25.5d;
        this.f79780q = 0.0d;
        this.f79781r = 60.0d;
        this.f79782s = true;
        this.f79783t = true;
        this.f79784u = true;
        this.f79785v = true;
        this.f79786w = true;
        this.f79787x = true;
        this.f79788y = true;
        this.f79789z = true;
        this.f79748A = 4;
        this.f79749B = false;
        this.f79750C = true;
        this.f79758K = true;
        this.f79759L = false;
        this.f79760M = "";
        this.f79761N = W2.MAX_EVENT_SIZE_BYTES;
        this.f79762O = 5L;
        this.f79763P = 60;
        this.f79764a = (CameraPosition) parcel.readParcelable(CameraPosition.class.getClassLoader());
        this.f79765b = parcel.readByte() != 0;
        this.f79766c = parcel.readByte() != 0;
        this.f79768e = parcel.readInt();
        this.f79769f = parcel.createIntArray();
        this.f79767d = parcel.readByte() != 0;
        Bitmap bitmap = (Bitmap) parcel.readParcelable(getClass().getClassLoader());
        if (bitmap != null) {
            this.f79770g = new BitmapDrawable(bitmap);
        }
        this.f79771h = parcel.readByte() != 0;
        this.f79772i = parcel.readInt();
        this.f79773j = parcel.createIntArray();
        this.f79775l = parcel.readByte() != 0;
        this.f79776m = parcel.readInt();
        this.f79777n = parcel.createIntArray();
        this.f79774k = parcel.readInt();
        this.f79778o = parcel.readDouble();
        this.f79779p = parcel.readDouble();
        this.f79780q = parcel.readDouble();
        this.f79781r = parcel.readDouble();
        this.f79782s = parcel.readByte() != 0;
        this.f79783t = parcel.readByte() != 0;
        this.f79784u = parcel.readByte() != 0;
        this.f79785v = parcel.readByte() != 0;
        this.f79786w = parcel.readByte() != 0;
        this.f79787x = parcel.readByte() != 0;
        this.f79788y = parcel.readByte() != 0;
        this.f79753F = parcel.readString();
        this.f79754G = parcel.readByte() != 0;
        this.f79755H = parcel.readByte() != 0;
        this.f79789z = parcel.readByte() != 0;
        this.f79748A = parcel.readInt();
        this.f79749B = parcel.readByte() != 0;
        this.f79750C = parcel.readByte() != 0;
        this.f79751D = parcel.readString();
        this.f79752E = parcel.createStringArray();
        this.f79757J = parcel.readFloat();
        this.f79756I = parcel.readInt();
        this.f79758K = parcel.readByte() != 0;
        this.f79759L = parcel.readByte() != 0;
        this.f79760M = parcel.readString();
        this.f79761N = parcel.readLong();
        this.f79762O = parcel.readLong();
        this.f79763P = parcel.readInt();
    }
}
