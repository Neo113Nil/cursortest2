package io.radar.sdk;

import Gh.C1165b;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.ParcelUuid;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: io.radar.sdk.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4631k0 {

    @NotNull
    private static final char[] HEX;

    /* renamed from: a, reason: collision with root package name */
    public static final C4631k0 f50118a = new C4631k0();

    /* renamed from: b, reason: collision with root package name */
    public static final ParcelUuid f50119b = ParcelUuid.fromString("0000FEAA-0000-1000-8000-00805F9B34FB");

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        HEX = charArray;
    }

    public final C1165b[] a(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return new C1165b[0];
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ScanResult scanResult = (ScanResult) it.next();
            ScanRecord scanRecord = scanResult.getScanRecord();
            if (scanRecord != null) {
                C4631k0 c4631k0 = f50118a;
                Intrinsics.checkNotNullExpressionValue(scanRecord, "scanRecord");
                C1165b d10 = c4631k0.d(scanResult, scanRecord);
                if (d10 != null) {
                    arrayList2.add(d10);
                }
            }
        }
        Object[] array = arrayList2.toArray(new C1165b[0]);
        if (array != null) {
            return (C1165b[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public final C1165b[] b(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            C1165b a10 = C1165b.f4041l.a(new JSONObject(str));
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        Object[] array = arrayList.toArray(new C1165b[0]);
        if (array != null) {
            return (C1165b[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public final C1165b[] c(Set set) {
        if (set == null) {
            return null;
        }
        Object[] array = set.toArray(new String[0]);
        if (array != null) {
            return b((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public final C1165b d(ScanResult result, ScanRecord scanRecord) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(scanRecord, "scanRecord");
        byte[] bytes = scanRecord.getBytes();
        List<ParcelUuid> serviceUuids = scanRecord.getServiceUuids();
        if (serviceUuids != null && serviceUuids.contains(f50119b)) {
            Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
            String k10 = k(bytes);
            return new C1165b(null, null, null, null, StringsKt.substring(k10, RangesKt.until(26, 46)), StringsKt.substring(k10, RangesKt.until(46, 58)), "", null, Integer.valueOf(result.getRssi()), null, C1165b.EnumC0090b.EDDYSTONE, 655, null);
        }
        for (int i10 = 2; i10 <= 5; i10++) {
            if ((bytes[i10 + 2] & UByte.MAX_VALUE) == 2 && (bytes[i10 + 3] & UByte.MAX_VALUE) == 21) {
                ByteBuffer wrap = ByteBuffer.wrap(bytes, i10 + 4, 20);
                UUID uuid = new UUID(wrap.getLong(), wrap.getLong());
                String valueOf = String.valueOf(((wrap.get() & UByte.MAX_VALUE) * 256) + (wrap.get() & UByte.MAX_VALUE));
                String valueOf2 = String.valueOf(((wrap.get() & UByte.MAX_VALUE) * 256) + (wrap.get() & UByte.MAX_VALUE));
                String uuid2 = uuid.toString();
                Intrinsics.checkNotNullExpressionValue(uuid2, "uuid.toString()");
                return new C1165b(null, null, null, null, uuid2, valueOf, valueOf2, null, Integer.valueOf(result.getRssi()), null, C1165b.EnumC0090b.IBEACON, 655, null);
            }
        }
        return null;
    }

    public final ScanFilter e(C1165b beacon) {
        Intrinsics.checkNotNullParameter(beacon, "beacon");
        if (beacon.e() == C1165b.EnumC0090b.EDDYSTONE) {
            String f10 = beacon.f();
            String a10 = beacon.a();
            ByteBuffer allocate = ByteBuffer.allocate(18);
            byte[] bArr = new byte[2];
            for (int i10 = 0; i10 < 2; i10++) {
                bArr[i10] = 0;
            }
            byte[] array = allocate.put(bArr).put(j(f10, 10)).put(j(a10, 6)).array();
            ByteBuffer put = ByteBuffer.allocate(18).put(new byte[]{-1}).put(new byte[]{0});
            byte[] bArr2 = new byte[16];
            for (int i11 = 0; i11 < 16; i11++) {
                bArr2[i11] = -1;
            }
            byte[] array2 = put.put(bArr2).array();
            ScanFilter.Builder builder = new ScanFilter.Builder();
            ParcelUuid parcelUuid = f50119b;
            return builder.setServiceUuid(parcelUuid).setServiceData(parcelUuid, array, array2).build();
        }
        if (beacon.e() != C1165b.EnumC0090b.IBEACON) {
            return null;
        }
        UUID fromString = UUID.fromString(beacon.f());
        int parseInt = Integer.parseInt(beacon.a());
        int parseInt2 = Integer.parseInt(beacon.c());
        ByteBuffer allocate2 = ByteBuffer.allocate(23);
        byte[] bArr3 = new byte[2];
        for (int i12 = 0; i12 < 2; i12++) {
            bArr3[i12] = 0;
        }
        byte[] array3 = allocate2.put(bArr3).putLong(fromString.getMostSignificantBits()).putLong(fromString.getLeastSignificantBits()).put((byte) (parseInt / 256)).put((byte) (parseInt % 256)).put((byte) (parseInt2 / 256)).put((byte) (parseInt2 % 256)).put(new byte[]{0}).array();
        ByteBuffer allocate3 = ByteBuffer.allocate(23);
        byte[] bArr4 = new byte[2];
        for (int i13 = 0; i13 < 2; i13++) {
            bArr4[i13] = 0;
        }
        ByteBuffer put2 = allocate3.put(bArr4);
        byte[] bArr5 = new byte[20];
        for (int i14 = 0; i14 < 20; i14++) {
            bArr5[i14] = -1;
        }
        return new ScanFilter.Builder().setManufacturerData(76, array3, put2.put(bArr5).put(new byte[]{0}).array()).build();
    }

    public final ScanFilter f(String beaconUUID) {
        Intrinsics.checkNotNullParameter(beaconUUID, "beaconUUID");
        String lowerCase = beaconUUID.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        UUID fromString = UUID.fromString(lowerCase);
        ByteBuffer allocate = ByteBuffer.allocate(23);
        byte[] bArr = new byte[2];
        for (int i10 = 0; i10 < 2; i10++) {
            bArr[i10] = 0;
        }
        ByteBuffer putLong = allocate.put(bArr).putLong(fromString.getMostSignificantBits()).putLong(fromString.getLeastSignificantBits());
        byte[] bArr2 = new byte[5];
        for (int i11 = 0; i11 < 5; i11++) {
            bArr2[i11] = 0;
        }
        byte[] array = putLong.put(bArr2).array();
        ByteBuffer allocate2 = ByteBuffer.allocate(23);
        byte[] bArr3 = new byte[2];
        for (int i12 = 0; i12 < 2; i12++) {
            bArr3[i12] = 0;
        }
        ByteBuffer put = allocate2.put(bArr3);
        byte[] bArr4 = new byte[16];
        for (int i13 = 0; i13 < 16; i13++) {
            bArr4[i13] = -1;
        }
        ByteBuffer put2 = put.put(bArr4);
        byte[] bArr5 = new byte[5];
        for (int i14 = 0; i14 < 5; i14++) {
            bArr5[i14] = 0;
        }
        return new ScanFilter.Builder().setManufacturerData(76, array, put2.put(bArr5).array()).build();
    }

    public final ScanFilter g(String beaconUID) {
        Intrinsics.checkNotNullParameter(beaconUID, "beaconUID");
        ByteBuffer allocate = ByteBuffer.allocate(18);
        byte[] bArr = new byte[2];
        for (int i10 = 0; i10 < 2; i10++) {
            bArr[i10] = 0;
        }
        ByteBuffer put = allocate.put(bArr).put(j(beaconUID, 10));
        byte[] bArr2 = new byte[6];
        for (int i11 = 0; i11 < 6; i11++) {
            bArr2[i11] = 0;
        }
        byte[] array = put.put(bArr2).array();
        ByteBuffer put2 = ByteBuffer.allocate(18).put(new byte[]{-1}).put(new byte[]{0});
        byte[] bArr3 = new byte[10];
        for (int i12 = 0; i12 < 10; i12++) {
            bArr3[i12] = -1;
        }
        ByteBuffer put3 = put2.put(bArr3);
        byte[] bArr4 = new byte[6];
        for (int i13 = 0; i13 < 6; i13++) {
            bArr4[i13] = 0;
        }
        byte[] array2 = put3.put(bArr4).array();
        ScanFilter.Builder builder = new ScanFilter.Builder();
        ParcelUuid parcelUuid = f50119b;
        return builder.setServiceUuid(parcelUuid).setServiceData(parcelUuid, array, array2).build();
    }

    public final String[] h(C1165b[] beacons) {
        Intrinsics.checkNotNullParameter(beacons, "beacons");
        ArrayList arrayList = new ArrayList();
        for (C1165b c1165b : beacons) {
            String jSONObject = c1165b.h().toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "beacon.toJson().toString()");
            arrayList.add(jSONObject);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public final Set i(C1165b[] c1165bArr) {
        if (c1165bArr == null) {
            return null;
        }
        return ArraysKt.toSet(h(c1165bArr));
    }

    public final byte[] j(String str, int i10) {
        List<String> chunked = StringsKt.chunked(str, 2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(chunked, 10));
        Iterator<T> it = chunked.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) Integer.parseInt((String) it.next(), CharsKt.checkRadix(16))));
        }
        return ArraysKt.sliceArray(CollectionsKt.toByteArray(arrayList), RangesKt.until(0, i10));
    }

    public final String k(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i11 + 1;
            int i13 = bArr[i10] & UByte.MAX_VALUE;
            int i14 = i11 * 2;
            char[] cArr2 = HEX;
            cArr[i14] = cArr2[i13 / 16];
            cArr[i14 + 1] = cArr2[i13 % 16];
            i10++;
            i11 = i12;
        }
        return ArraysKt.joinToString$default(cArr, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }
}
