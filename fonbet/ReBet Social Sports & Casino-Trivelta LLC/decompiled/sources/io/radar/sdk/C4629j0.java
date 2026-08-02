package io.radar.sdk;

import Gh.C1165b;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.radar.sdk.C4589c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.radar.sdk.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4629j0 {

    /* renamed from: k, reason: collision with root package name */
    public static final a f50099k = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f50100a;

    /* renamed from: b, reason: collision with root package name */
    public final G0 f50101b;

    @NotNull
    private String[] beaconUIDs;

    @NotNull
    private String[] beaconUUIDs;

    @NotNull
    private C1165b[] beacons;

    /* renamed from: c, reason: collision with root package name */
    public J0 f50102c;

    /* renamed from: d, reason: collision with root package name */
    public BluetoothAdapter f50103d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f50104e;

    /* renamed from: f, reason: collision with root package name */
    public final List f50105f;

    /* renamed from: g, reason: collision with root package name */
    public Set f50106g;

    /* renamed from: h, reason: collision with root package name */
    public Set f50107h;

    /* renamed from: i, reason: collision with root package name */
    public ScanCallback f50108i;

    /* renamed from: j, reason: collision with root package name */
    public final Handler f50109j;

    /* renamed from: io.radar.sdk.j0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: io.radar.sdk.j0$b */
    public static final class b extends ScanCallback {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C4629j0 f50111b;

        public b(C4629j0 c4629j0) {
            this.f50111b = c4629j0;
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(List list) {
            super.onBatchScanResults(list);
            if (list != null) {
                C4629j0 c4629j0 = C4629j0.this;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C4629j0.k(c4629j0, 2, (ScanResult) it.next(), false, 4, null);
                }
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i10) {
            super.onScanFailed(i10);
            G0.b(this.f50111b.f50101b, "Scan failed", null, null, 6, null);
            C4629j0.this.t();
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i10, ScanResult scanResult) {
            super.onScanResult(i10, scanResult);
            C4629j0.k(C4629j0.this, i10, scanResult, false, 4, null);
        }
    }

    /* renamed from: io.radar.sdk.j0$c */
    public static final class c extends ScanCallback {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C4629j0 f50113b;

        public c(C4629j0 c4629j0) {
            this.f50113b = c4629j0;
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(List list) {
            super.onBatchScanResults(list);
            if (list != null) {
                C4629j0 c4629j0 = C4629j0.this;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C4629j0.k(c4629j0, 2, (ScanResult) it.next(), false, 4, null);
                }
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i10) {
            super.onScanFailed(i10);
            G0.b(this.f50113b.f50101b, "Scan failed", null, null, 6, null);
            C4629j0.this.t();
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i10, ScanResult scanResult) {
            super.onScanResult(i10, scanResult);
            C4629j0.k(C4629j0.this, i10, scanResult, false, 4, null);
        }
    }

    public C4629j0(Context context, G0 logger, J0 permissionsHelper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(permissionsHelper, "permissionsHelper");
        this.f50100a = context;
        this.f50101b = logger;
        this.f50102c = permissionsHelper;
        this.f50105f = Collections.synchronizedList(new ArrayList());
        this.f50106g = SetsKt.emptySet();
        this.f50107h = new LinkedHashSet();
        this.beacons = new C1165b[0];
        this.beaconUUIDs = new String[0];
        this.beaconUIDs = new String[0];
        this.f50109j = new Handler(Looper.getMainLooper());
    }

    public static /* synthetic */ void g(C4629j0 c4629j0, C1165b[] c1165bArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c1165bArr = null;
        }
        c4629j0.f(c1165bArr);
    }

    public static /* synthetic */ void k(C4629j0 c4629j0, int i10, ScanResult scanResult, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        c4629j0.j(i10, scanResult, z10);
    }

    public static final void n(C4629j0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        G0.b(this$0.f50101b, "Beacon ranging timeout", null, null, 6, null);
        this$0.t();
    }

    public static final void p(C4629j0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        G0.b(this$0.f50101b, "Beacon ranging timeout", null, null, 6, null);
        this$0.t();
    }

    public final void e(C4589c.InterfaceC0745c interfaceC0745c) {
        if (interfaceC0745c == null) {
            return;
        }
        List callbacks = this.f50105f;
        Intrinsics.checkNotNullExpressionValue(callbacks, "callbacks");
        synchronized (callbacks) {
            this.f50105f.add(interfaceC0745c);
        }
    }

    public final void f(C1165b[] c1165bArr) {
        List callbacks = this.f50105f;
        Intrinsics.checkNotNullExpressionValue(callbacks, "callbacks");
        synchronized (callbacks) {
            try {
                if (this.f50105f.isEmpty()) {
                    return;
                }
                G0.b(this.f50101b, "Calling callbacks | callbacks.size = " + this.f50105f.size(), null, null, 6, null);
                Iterator it = this.f50105f.iterator();
                while (it.hasNext()) {
                    ((C4589c.InterfaceC0745c) it.next()).a(C4589c.EnumC4607s.SUCCESS, c1165bArr);
                }
                this.f50105f.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final ScanSettings h(int i10) {
        ScanSettings build = new ScanSettings.Builder().setScanMode(i10).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .s…ode)\n            .build()");
        return build;
    }

    public final void i(C1165b[] c1165bArr, C4589c.EnumC4597i source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (c1165bArr == null || c1165bArr.length == 0) {
            G0.b(this.f50101b, "No beacons to handle", null, null, 6, null);
            return;
        }
        for (C1165b c1165b : c1165bArr) {
            if (source == C4589c.EnumC4597i.BEACON_EXIT) {
                G0.b(this.f50101b, "Handling beacon exit | beacon.type = " + c1165b.e() + "; beacon.uuid = " + c1165b.f() + "; beacon.major = " + c1165b.a() + "; beacon.minor = " + c1165b.c() + "; beacon.rssi = " + c1165b.d(), null, null, 6, null);
                this.f50107h.remove(c1165b);
            } else {
                G0.b(this.f50101b, "Handling beacon entry | beacon.type = " + c1165b.e() + "; beacon.uuid = " + c1165b.f() + "; beacon.major = " + c1165b.a() + "; beacon.minor = " + c1165b.c() + "; beacon.rssi = " + c1165b.d(), null, null, 6, null);
                this.f50107h.add(c1165b);
            }
        }
    }

    public final void j(int i10, ScanResult scanResult, boolean z10) {
        C1165b d10;
        G0.b(this.f50101b, "Handling scan result", null, null, 6, null);
        if (scanResult != null) {
            try {
                ScanRecord scanRecord = scanResult.getScanRecord();
                if (scanRecord != null && (d10 = C4631k0.f50118a.d(scanResult, scanRecord)) != null) {
                    G0.b(this.f50101b, "Ranged beacon | beacon.type = " + d10.e() + "; beacon.uuid = " + d10.f() + "; beacon.major = " + d10.a() + "; beacon.minor = " + d10.c() + "; beacon.rssi = " + d10.d(), null, null, 6, null);
                    if (i10 == 4) {
                        G0.b(this.f50101b, "Handling beacon exit | beacon.type = " + d10.e() + "; beacon.uuid = " + d10.f() + "; beacon.major = " + d10.a() + "; beacon.minor = " + d10.c() + "; beacon.rssi = " + d10.d(), null, null, 6, null);
                        this.f50107h.remove(d10);
                    } else {
                        G0.b(this.f50101b, "Handling beacon entry | beacon.type = " + d10.e() + "; beacon.uuid = " + d10.f() + "; beacon.major = " + d10.a() + "; beacon.minor = " + d10.c() + "; beacon.rssi = " + d10.d(), null, null, 6, null);
                        this.f50107h.add(d10);
                    }
                }
            } catch (Exception e10) {
                this.f50101b.c("Error handling scan result", C4589c.EnumC4600l.SDK_EXCEPTION, e10);
            }
        }
        if (this.f50107h.size() == this.beacons.length && z10) {
            G0.b(this.f50101b, "Finished ranging", null, null, 6, null);
            t();
        }
    }

    public final boolean l(Context context) {
        BluetoothAdapter defaultAdapter;
        if (this.f50103d == null && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null) {
            this.f50103d = defaultAdapter;
        }
        if (!context.getPackageManager().hasSystemFeature("android.hardware.bluetooth")) {
            return false;
        }
        if (this.f50103d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        BluetoothAdapter bluetoothAdapter = this.f50103d;
        if (bluetoothAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            bluetoothAdapter = null;
        }
        return bluetoothAdapter.getBluetoothLeScanner() != null;
    }

    public final void m(String[] strArr, String[] strArr2, boolean z10, C4589c.InterfaceC0745c interfaceC0745c) {
        ScanFilter scanFilter;
        ScanFilter scanFilter2;
        BluetoothAdapter bluetoothAdapter = null;
        if (!this.f50102c.a(this.f50100a)) {
            G0.b(this.f50101b, "Bluetooth permissions not granted", null, null, 6, null);
            C4589c c4589c = C4589c.f49918a;
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.ERROR_PERMISSIONS;
            C4589c.m0(c4589c, enumC4607s, null, 2, null);
            if (interfaceC0745c != null) {
                C4589c.InterfaceC0745c.a.a(interfaceC0745c, enumC4607s, null, 2, null);
                return;
            }
            return;
        }
        if (!l(this.f50100a)) {
            G0.b(this.f50101b, "Bluetooth not supported", null, null, 6, null);
            C4589c c4589c2 = C4589c.f49918a;
            C4589c.EnumC4607s enumC4607s2 = C4589c.EnumC4607s.ERROR_BLUETOOTH;
            C4589c.m0(c4589c2, enumC4607s2, null, 2, null);
            if (interfaceC0745c != null) {
                C4589c.InterfaceC0745c.a.a(interfaceC0745c, enumC4607s2, null, 2, null);
                return;
            }
            return;
        }
        if (this.f50103d == null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            Intrinsics.checkNotNullExpressionValue(defaultAdapter, "getDefaultAdapter()");
            this.f50103d = defaultAdapter;
        }
        BluetoothAdapter bluetoothAdapter2 = this.f50103d;
        if (bluetoothAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            bluetoothAdapter2 = null;
        }
        if (!bluetoothAdapter2.isEnabled()) {
            G0.b(this.f50101b, "Bluetooth not enabled", null, null, 6, null);
            C4589c c4589c3 = C4589c.f49918a;
            C4589c.EnumC4607s enumC4607s3 = C4589c.EnumC4607s.ERROR_BLUETOOTH;
            C4589c.m0(c4589c3, enumC4607s3, null, 2, null);
            if (interfaceC0745c != null) {
                C4589c.InterfaceC0745c.a.a(interfaceC0745c, enumC4607s3, null, 2, null);
                return;
            }
            return;
        }
        if ((strArr == null || strArr.length == 0) && (strArr2 == null || strArr2.length == 0)) {
            G0.b(this.f50101b, "No beacon UUIDs or UIDs to range", null, null, 6, null);
            if (interfaceC0745c != null) {
                interfaceC0745c.a(C4589c.EnumC4607s.SUCCESS, new C1165b[0]);
                return;
            }
            return;
        }
        e(interfaceC0745c);
        if (this.f50104e) {
            G0.b(this.f50101b, "Already ranging beacons", null, null, 6, null);
            return;
        }
        this.beaconUUIDs = strArr == null ? new String[0] : strArr;
        this.beaconUIDs = strArr2 == null ? new String[0] : strArr2;
        this.f50104e = true;
        ArrayList arrayList = new ArrayList();
        if (strArr != null) {
            Iterator it = ArrayIteratorKt.iterator(strArr);
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    G0.b(this.f50101b, "Building scan filter for ranging | beaconUUID = " + str, null, null, 6, null);
                    scanFilter2 = C4631k0.f50118a.f(str);
                } catch (Exception e10) {
                    this.f50101b.a("Error building scan filter for ranging | beaconUUID = " + str, C4589c.EnumC4600l.SDK_EXCEPTION, e10);
                    scanFilter2 = null;
                }
                if (scanFilter2 != null) {
                    G0.b(this.f50101b, "Starting ranging beacon UUID | beaconUUID = " + str, null, null, 6, null);
                    arrayList.add(scanFilter2);
                }
            }
        }
        if (strArr2 != null) {
            Iterator it2 = ArrayIteratorKt.iterator(strArr2);
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                try {
                    G0.b(this.f50101b, "Building scan filter for ranging | beaconUID = " + str2, null, null, 6, null);
                    scanFilter = C4631k0.f50118a.g(str2);
                } catch (Exception e11) {
                    this.f50101b.a("Error building scan filter for ranging | beaconUID = " + str2, C4589c.EnumC4600l.SDK_EXCEPTION, e11);
                    scanFilter = null;
                }
                if (scanFilter != null) {
                    G0.b(this.f50101b, "Starting ranging beacon UID | beaconUID = " + str2, null, null, 6, null);
                    arrayList.add(scanFilter);
                }
            }
        }
        if (arrayList.size() == 0) {
            G0.b(this.f50101b, "No scan filters for ranging", null, null, 6, null);
            g(this, null, 1, null);
            return;
        }
        ScanSettings h10 = h(z10 ? 0 : 2);
        this.f50108i = new b(this);
        try {
            BluetoothAdapter bluetoothAdapter3 = this.f50103d;
            if (bluetoothAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                bluetoothAdapter = bluetoothAdapter3;
            }
            bluetoothAdapter.getBluetoothLeScanner().startScan(arrayList, h10, this.f50108i);
        } catch (Exception e12) {
            this.f50101b.c("Error starting ranging beacon UUIDs", C4589c.EnumC4600l.SDK_EXCEPTION, e12);
        }
        this.f50109j.postAtTime(new Runnable() { // from class: io.radar.sdk.h0
            @Override // java.lang.Runnable
            public final void run() {
                C4629j0.n(C4629j0.this);
            }
        }, "timeout", SystemClock.uptimeMillis() + 5000);
    }

    public final void o(C1165b[] beacons, boolean z10, C4589c.InterfaceC0745c interfaceC0745c) {
        ScanFilter scanFilter;
        Intrinsics.checkNotNullParameter(beacons, "beacons");
        BluetoothAdapter bluetoothAdapter = null;
        if (!this.f50102c.a(this.f50100a)) {
            G0.b(this.f50101b, "Bluetooth permissions not granted", null, null, 6, null);
            C4589c c4589c = C4589c.f49918a;
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.ERROR_PERMISSIONS;
            C4589c.m0(c4589c, enumC4607s, null, 2, null);
            if (interfaceC0745c != null) {
                C4589c.InterfaceC0745c.a.a(interfaceC0745c, enumC4607s, null, 2, null);
                return;
            }
            return;
        }
        if (!l(this.f50100a)) {
            G0.b(this.f50101b, "Bluetooth not supported", null, null, 6, null);
            C4589c c4589c2 = C4589c.f49918a;
            C4589c.EnumC4607s enumC4607s2 = C4589c.EnumC4607s.ERROR_BLUETOOTH;
            C4589c.m0(c4589c2, enumC4607s2, null, 2, null);
            if (interfaceC0745c != null) {
                C4589c.InterfaceC0745c.a.a(interfaceC0745c, enumC4607s2, null, 2, null);
                return;
            }
            return;
        }
        if (this.f50103d == null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            Intrinsics.checkNotNullExpressionValue(defaultAdapter, "getDefaultAdapter()");
            this.f50103d = defaultAdapter;
        }
        BluetoothAdapter bluetoothAdapter2 = this.f50103d;
        if (bluetoothAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            bluetoothAdapter2 = null;
        }
        if (!bluetoothAdapter2.isEnabled()) {
            G0.b(this.f50101b, "Bluetooth not enabled", null, null, 6, null);
            C4589c c4589c3 = C4589c.f49918a;
            C4589c.EnumC4607s enumC4607s3 = C4589c.EnumC4607s.ERROR_BLUETOOTH;
            C4589c.m0(c4589c3, enumC4607s3, null, 2, null);
            if (interfaceC0745c != null) {
                C4589c.InterfaceC0745c.a.a(interfaceC0745c, enumC4607s3, null, 2, null);
                return;
            }
            return;
        }
        if (beacons.length == 0) {
            G0.b(this.f50101b, "No beacons to range", null, null, 6, null);
            if (interfaceC0745c != null) {
                interfaceC0745c.a(C4589c.EnumC4607s.SUCCESS, new C1165b[0]);
                return;
            }
            return;
        }
        e(interfaceC0745c);
        if (this.f50104e) {
            G0.b(this.f50101b, "Already ranging beacons", null, null, 6, null);
            return;
        }
        this.beacons = beacons;
        this.f50104e = true;
        ArrayList arrayList = new ArrayList();
        for (C1165b c1165b : beacons) {
            try {
                G0.b(this.f50101b, "Building scan filter for ranging | _id = " + c1165b.g(), null, null, 6, null);
                scanFilter = C4631k0.f50118a.e(c1165b);
            } catch (Exception e10) {
                this.f50101b.a("Error building scan filter for ranging | _id = " + c1165b.g(), C4589c.EnumC4600l.SDK_EXCEPTION, e10);
                scanFilter = null;
            }
            if (scanFilter != null) {
                G0.b(this.f50101b, "Starting ranging beacon | type = " + c1165b.e() + "; _id = " + c1165b.g() + "; uuid = " + c1165b.f() + "; major = " + c1165b.a() + "; minor = " + c1165b.c(), null, null, 6, null);
                arrayList.add(scanFilter);
            }
        }
        if (arrayList.size() == 0) {
            G0.b(this.f50101b, "No scan filters for ranging", null, null, 6, null);
            g(this, null, 1, null);
            return;
        }
        ScanSettings h10 = h(z10 ? 0 : 2);
        this.f50108i = new c(this);
        try {
            BluetoothAdapter bluetoothAdapter3 = this.f50103d;
            if (bluetoothAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                bluetoothAdapter = bluetoothAdapter3;
            }
            bluetoothAdapter.getBluetoothLeScanner().startScan(arrayList, h10, this.f50108i);
        } catch (Exception e11) {
            this.f50101b.c("Error starting ranging beacons", C4589c.EnumC4600l.SDK_EXCEPTION, e11);
        }
        this.f50109j.postAtTime(new Runnable() { // from class: io.radar.sdk.i0
            @Override // java.lang.Runnable
            public final void run() {
                C4629j0.p(C4629j0.this);
            }
        }, "timeout", SystemClock.uptimeMillis() + 5000);
    }

    public final void q(String[] strArr, String[] strArr2) {
        ScanFilter scanFilter;
        ScanFilter scanFilter2;
        if (L0.f49705a.s(this.f50100a).m()) {
            return;
        }
        if (!this.f50102c.a(this.f50100a)) {
            G0.b(this.f50101b, "Bluetooth permissions not granted", null, null, 6, null);
            return;
        }
        if (!l(this.f50100a)) {
            G0.b(this.f50101b, "Bluetooth not supported", null, null, 6, null);
            return;
        }
        if (this.f50103d == null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            Intrinsics.checkNotNullExpressionValue(defaultAdapter, "getDefaultAdapter()");
            this.f50103d = defaultAdapter;
        }
        BluetoothAdapter bluetoothAdapter = this.f50103d;
        BluetoothAdapter bluetoothAdapter2 = null;
        if (bluetoothAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            bluetoothAdapter = null;
        }
        if (!bluetoothAdapter.isEnabled()) {
            G0.b(this.f50101b, "Bluetooth not enabled", null, null, 6, null);
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (strArr != null) {
            CollectionsKt.addAll(linkedHashSet, strArr);
        }
        if (strArr2 != null) {
            CollectionsKt.addAll(linkedHashSet, strArr2);
        }
        if (Intrinsics.areEqual(this.f50106g, linkedHashSet)) {
            G0.b(this.f50101b, "Already monitoring beacons", null, null, 6, null);
            return;
        }
        s();
        if ((strArr == null || strArr.length == 0) && (strArr2 == null || strArr2.length == 0)) {
            G0.b(this.f50101b, "No beacon UUIDs or UIDs to monitor", null, null, 6, null);
            return;
        }
        this.f50106g = linkedHashSet;
        ArrayList arrayList = new ArrayList();
        if (strArr != null) {
            Iterator it = ArrayIteratorKt.iterator(strArr);
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    G0.b(this.f50101b, "Building scan filter for monitoring | beaconUUID = " + str, null, null, 6, null);
                    scanFilter2 = C4631k0.f50118a.f(str);
                } catch (Exception e10) {
                    this.f50101b.a("Error building scan filter for monitoring | beaconUUID = " + str, C4589c.EnumC4600l.SDK_EXCEPTION, e10);
                    scanFilter2 = null;
                }
                if (scanFilter2 != null) {
                    G0.b(this.f50101b, "Starting monitoring beacon UUID | beaconUUID = " + str, null, null, 6, null);
                    arrayList.add(scanFilter2);
                }
            }
        }
        if (strArr2 != null) {
            Iterator it2 = ArrayIteratorKt.iterator(strArr2);
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                try {
                    G0.b(this.f50101b, "Building scan filter for monitoring | beaconUID = " + str2, null, null, 6, null);
                    scanFilter = C4631k0.f50118a.g(str2);
                } catch (Exception e11) {
                    this.f50101b.a("Error building scan filter for monitoring | beaconUID = " + str2, C4589c.EnumC4600l.SDK_EXCEPTION, e11);
                    scanFilter = null;
                }
                if (scanFilter != null) {
                    G0.b(this.f50101b, "Starting monitoring beacon UID | beaconUID = " + str2, null, null, 6, null);
                    arrayList.add(scanFilter);
                }
            }
        }
        if (arrayList.size() == 0) {
            G0.b(this.f50101b, "No scan filters for monitoring", null, null, 6, null);
            return;
        }
        try {
            ScanSettings h10 = h(0);
            G0.b(this.f50101b, "Starting monitoring beacon UUIDs", null, null, 6, null);
            BluetoothAdapter bluetoothAdapter3 = this.f50103d;
            if (bluetoothAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                bluetoothAdapter2 = bluetoothAdapter3;
            }
            bluetoothAdapter2.getBluetoothLeScanner().startScan((List<ScanFilter>) arrayList, h10, RadarLocationReceiver.INSTANCE.c(this.f50100a));
        } catch (Exception e12) {
            this.f50101b.c("Error starting monitoring beacon UUIDs", C4589c.EnumC4600l.SDK_EXCEPTION, e12);
        }
    }

    public final void r(C1165b[] beacons) {
        ScanFilter scanFilter;
        Intrinsics.checkNotNullParameter(beacons, "beacons");
        if (L0.f49705a.s(this.f50100a).m()) {
            return;
        }
        if (!this.f50102c.a(this.f50100a)) {
            G0.b(this.f50101b, "Bluetooth permissions not granted", null, null, 6, null);
            return;
        }
        if (!l(this.f50100a)) {
            G0.b(this.f50101b, "Bluetooth not supported", null, null, 6, null);
            return;
        }
        if (this.f50103d == null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            Intrinsics.checkNotNullExpressionValue(defaultAdapter, "getDefaultAdapter()");
            this.f50103d = defaultAdapter;
        }
        BluetoothAdapter bluetoothAdapter = this.f50103d;
        BluetoothAdapter bluetoothAdapter2 = null;
        if (bluetoothAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            bluetoothAdapter = null;
        }
        if (!bluetoothAdapter.isEnabled()) {
            G0.b(this.f50101b, "Bluetooth not enabled", null, null, 6, null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C1165b c1165b : beacons) {
            String g10 = c1165b.g();
            if (g10 != null) {
                arrayList.add(g10);
            }
        }
        Set set = CollectionsKt.toSet(arrayList);
        if (Intrinsics.areEqual(this.f50106g, set)) {
            G0.b(this.f50101b, "Already monitoring beacons", null, null, 6, null);
            return;
        }
        s();
        if (beacons.length == 0) {
            G0.b(this.f50101b, "No beacons to monitor", null, null, 6, null);
            return;
        }
        this.f50106g = set;
        ArrayList arrayList2 = new ArrayList();
        for (C1165b c1165b2 : beacons) {
            try {
                G0.b(this.f50101b, "Building scan filter for monitoring | _id = " + c1165b2.g(), null, null, 6, null);
                scanFilter = C4631k0.f50118a.e(c1165b2);
            } catch (Exception e10) {
                this.f50101b.a("Error building scan filter for monitoring | _id = " + c1165b2.g(), C4589c.EnumC4600l.SDK_EXCEPTION, e10);
                scanFilter = null;
            }
            if (scanFilter != null) {
                G0.b(this.f50101b, "Starting monitoring beacon | _id = " + c1165b2.g() + "; uuid = " + c1165b2.f() + "; major = " + c1165b2.a() + "; minor = " + c1165b2.c(), null, null, 6, null);
                arrayList2.add(scanFilter);
            }
        }
        if (arrayList2.size() == 0) {
            G0.b(this.f50101b, "No scan filters for monitoring", null, null, 6, null);
            return;
        }
        try {
            ScanSettings h10 = h(0);
            G0.b(this.f50101b, "Starting monitoring beacons", null, null, 6, null);
            BluetoothAdapter bluetoothAdapter3 = this.f50103d;
            if (bluetoothAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                bluetoothAdapter2 = bluetoothAdapter3;
            }
            bluetoothAdapter2.getBluetoothLeScanner().startScan((List<ScanFilter>) arrayList2, h10, RadarLocationReceiver.INSTANCE.c(this.f50100a));
        } catch (Exception e11) {
            this.f50101b.c("Error starting monitoring beacons", C4589c.EnumC4600l.SDK_EXCEPTION, e11);
        }
    }

    public final void s() {
        if (!L0.f49705a.s(this.f50100a).m() && this.f50102c.a(this.f50100a) && l(this.f50100a)) {
            if (this.f50103d == null) {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                Intrinsics.checkNotNullExpressionValue(defaultAdapter, "getDefaultAdapter()");
                this.f50103d = defaultAdapter;
            }
            BluetoothAdapter bluetoothAdapter = this.f50103d;
            BluetoothAdapter bluetoothAdapter2 = null;
            if (bluetoothAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                bluetoothAdapter = null;
            }
            if (!bluetoothAdapter.isEnabled()) {
                G0.b(this.f50101b, "Bluetooth not enabled", null, null, 6, null);
                return;
            }
            G0.b(this.f50101b, "Stopping monitoring beacons", null, null, 6, null);
            try {
                BluetoothAdapter bluetoothAdapter3 = this.f50103d;
                if (bluetoothAdapter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    bluetoothAdapter2 = bluetoothAdapter3;
                }
                bluetoothAdapter2.getBluetoothLeScanner().stopScan(RadarLocationReceiver.INSTANCE.c(this.f50100a));
            } catch (Exception e10) {
                this.f50101b.a("Error stopping monitoring beacons", C4589c.EnumC4600l.SDK_EXCEPTION, e10);
            }
            this.f50106g = SetsKt.emptySet();
        }
    }

    public final void t() {
        if (this.f50102c.a(this.f50100a) && l(this.f50100a)) {
            if (this.f50103d == null) {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                Intrinsics.checkNotNullExpressionValue(defaultAdapter, "getDefaultAdapter()");
                this.f50103d = defaultAdapter;
            }
            G0.b(this.f50101b, "Stopping ranging", null, null, 6, null);
            this.f50109j.removeCallbacksAndMessages("timeout");
            try {
                BluetoothAdapter bluetoothAdapter = this.f50103d;
                if (bluetoothAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    bluetoothAdapter = null;
                }
                bluetoothAdapter.getBluetoothLeScanner().stopScan(this.f50108i);
            } catch (Exception e10) {
                this.f50101b.a("Error stopping ranging beacons", C4589c.EnumC4600l.SDK_EXCEPTION, e10);
            }
            this.f50108i = null;
            Object[] array = this.f50107h.toArray(new C1165b[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            f((C1165b[]) array);
            this.beacons = new C1165b[0];
            this.f50104e = false;
            this.f50107h.clear();
        }
    }

    public /* synthetic */ C4629j0(Context context, G0 g02, J0 j02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, g02, (i10 & 4) != 0 ? new J0() : j02);
    }
}
