package io.radar.sdk;

import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.ParcelUuid;
import io.radar.sdk.model.RadarBeacon;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: RadarBeaconUtils.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0002\u0010\u0010J#\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b¢\u0006\u0002\u0010\u0014J#\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u0013J\u0010\u0010!\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\"\u001a\u00020\u0013J\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010%J#\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00172\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010'J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\tH\u0002J\u0010\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020)H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lio/radar/sdk/RadarBeaconUtils;", "", "()V", "EDDYSTONE_SERVICE_UUID", "Landroid/os/ParcelUuid;", "kotlin.jvm.PlatformType", "HEX", "", "IBEACON_MANUFACTURER_ID", "", "beaconsForScanResults", "", "Lio/radar/sdk/model/RadarBeacon;", "scanResults", "Ljava/util/ArrayList;", "Landroid/bluetooth/le/ScanResult;", "(Ljava/util/ArrayList;)[Lio/radar/sdk/model/RadarBeacon;", "beaconsForStringArray", "arr", "", "([Ljava/lang/String;)[Lio/radar/sdk/model/RadarBeacon;", "beaconsForStringSet", "set", "", "(Ljava/util/Set;)[Lio/radar/sdk/model/RadarBeacon;", "getBeacon", "result", "scanRecord", "Landroid/bluetooth/le/ScanRecord;", "getScanFilterForBeacon", "Landroid/bluetooth/le/ScanFilter;", "beacon", "beaconUUID", "getScanFilterForBeaconUID", "beaconUID", "stringArrayForBeacons", RadarTrackingOptions.KEY_BEACONS, "([Lio/radar/sdk/model/RadarBeacon;)[Ljava/lang/String;", "stringSetForBeacons", "([Lio/radar/sdk/model/RadarBeacon;)Ljava/util/Set;", "toByteArray", "", "hex", "max", "toHex", "bytes", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarBeaconUtils {
    private static final char[] HEX;
    private static final int IBEACON_MANUFACTURER_ID = 76;
    public static final RadarBeaconUtils INSTANCE = new RadarBeaconUtils();
    private static final ParcelUuid EDDYSTONE_SERVICE_UUID = ParcelUuid.fromString("0000FEAA-0000-1000-8000-00805F9B34FB");

    private RadarBeaconUtils() {
    }

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        HEX = charArray;
    }

    public final RadarBeacon[] beaconsForScanResults(ArrayList<ScanResult> scanResults) {
        ArrayList<ScanResult> arrayList = scanResults;
        if (arrayList == null || arrayList.isEmpty()) {
            return new RadarBeacon[0];
        }
        ArrayList arrayList2 = new ArrayList();
        for (ScanResult scanResult : scanResults) {
            ScanRecord scanRecord = scanResult.getScanRecord();
            if (scanRecord != null) {
                RadarBeaconUtils radarBeaconUtils = INSTANCE;
                Intrinsics.checkNotNull(scanRecord);
                RadarBeacon beacon = radarBeaconUtils.getBeacon(scanResult, scanRecord);
                if (beacon != null) {
                    arrayList2.add(beacon);
                }
            }
        }
        return (RadarBeacon[]) arrayList2.toArray(new RadarBeacon[0]);
    }

    public final Set<String> stringSetForBeacons(RadarBeacon[] beacons) {
        if (beacons == null) {
            return null;
        }
        return ArraysKt.toSet(stringArrayForBeacons(beacons));
    }

    public final String[] stringArrayForBeacons(RadarBeacon[] beacons) {
        Intrinsics.checkNotNullParameter(beacons, "beacons");
        ArrayList arrayList = new ArrayList();
        for (RadarBeacon radarBeacon : beacons) {
            String jSONObject = radarBeacon.toJson().toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            arrayList.add(jSONObject);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final RadarBeacon[] beaconsForStringSet(Set<String> set) {
        if (set == null) {
            return null;
        }
        return beaconsForStringArray((String[]) set.toArray(new String[0]));
    }

    public final RadarBeacon[] beaconsForStringArray(String[] arr) {
        if (arr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : arr) {
            RadarBeacon fromJson = RadarBeacon.INSTANCE.fromJson(new JSONObject(str));
            if (fromJson != null) {
                arrayList.add(fromJson);
            }
        }
        return (RadarBeacon[]) arrayList.toArray(new RadarBeacon[0]);
    }

    public final ScanFilter getScanFilterForBeacon(RadarBeacon beacon) {
        Intrinsics.checkNotNullParameter(beacon, "beacon");
        if (beacon.getType() == RadarBeacon.RadarBeaconType.EDDYSTONE) {
            String uuid = beacon.getUuid();
            String major = beacon.getMajor();
            ByteBuffer allocate = ByteBuffer.allocate(18);
            byte[] bArr = new byte[2];
            for (int i = 0; i < 2; i++) {
                bArr[i] = 0;
            }
            byte[] array = allocate.put(bArr).put(toByteArray(uuid, 10)).put(toByteArray(major, 6)).array();
            ByteBuffer put = ByteBuffer.allocate(18).put(new byte[]{-1}).put(new byte[]{0});
            byte[] bArr2 = new byte[16];
            for (int i2 = 0; i2 < 16; i2++) {
                bArr2[i2] = -1;
            }
            byte[] array2 = put.put(bArr2).array();
            ScanFilter.Builder builder = new ScanFilter.Builder();
            ParcelUuid parcelUuid = EDDYSTONE_SERVICE_UUID;
            return builder.setServiceUuid(parcelUuid).setServiceData(parcelUuid, array, array2).build();
        }
        if (beacon.getType() != RadarBeacon.RadarBeaconType.IBEACON) {
            return null;
        }
        UUID fromString = UUID.fromString(beacon.getUuid());
        int parseInt = Integer.parseInt(beacon.getMajor());
        int parseInt2 = Integer.parseInt(beacon.getMinor());
        ByteBuffer allocate2 = ByteBuffer.allocate(23);
        byte[] bArr3 = new byte[2];
        for (int i3 = 0; i3 < 2; i3++) {
            bArr3[i3] = 0;
        }
        byte[] array3 = allocate2.put(bArr3).putLong(fromString.getMostSignificantBits()).putLong(fromString.getLeastSignificantBits()).put((byte) (parseInt / 256)).put((byte) (parseInt % 256)).put((byte) (parseInt2 / 256)).put((byte) (parseInt2 % 256)).put(new byte[]{0}).array();
        ByteBuffer allocate3 = ByteBuffer.allocate(23);
        byte[] bArr4 = new byte[2];
        for (int i4 = 0; i4 < 2; i4++) {
            bArr4[i4] = 0;
        }
        ByteBuffer put2 = allocate3.put(bArr4);
        byte[] bArr5 = new byte[20];
        for (int i5 = 0; i5 < 20; i5++) {
            bArr5[i5] = -1;
        }
        return new ScanFilter.Builder().setManufacturerData(76, array3, put2.put(bArr5).put(new byte[]{0}).array()).build();
    }

    public final ScanFilter getScanFilterForBeacon(String beaconUUID) {
        Intrinsics.checkNotNullParameter(beaconUUID, "beaconUUID");
        String lowerCase = beaconUUID.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        UUID fromString = UUID.fromString(lowerCase);
        ByteBuffer allocate = ByteBuffer.allocate(23);
        byte[] bArr = new byte[2];
        for (int i = 0; i < 2; i++) {
            bArr[i] = 0;
        }
        ByteBuffer putLong = allocate.put(bArr).putLong(fromString.getMostSignificantBits()).putLong(fromString.getLeastSignificantBits());
        byte[] bArr2 = new byte[5];
        for (int i2 = 0; i2 < 5; i2++) {
            bArr2[i2] = 0;
        }
        byte[] array = putLong.put(bArr2).array();
        ByteBuffer allocate2 = ByteBuffer.allocate(23);
        byte[] bArr3 = new byte[2];
        for (int i3 = 0; i3 < 2; i3++) {
            bArr3[i3] = 0;
        }
        ByteBuffer put = allocate2.put(bArr3);
        byte[] bArr4 = new byte[16];
        for (int i4 = 0; i4 < 16; i4++) {
            bArr4[i4] = -1;
        }
        ByteBuffer put2 = put.put(bArr4);
        byte[] bArr5 = new byte[5];
        for (int i5 = 0; i5 < 5; i5++) {
            bArr5[i5] = 0;
        }
        return new ScanFilter.Builder().setManufacturerData(76, array, put2.put(bArr5).array()).build();
    }

    public final ScanFilter getScanFilterForBeaconUID(String beaconUID) {
        Intrinsics.checkNotNullParameter(beaconUID, "beaconUID");
        ByteBuffer allocate = ByteBuffer.allocate(18);
        byte[] bArr = new byte[2];
        for (int i = 0; i < 2; i++) {
            bArr[i] = 0;
        }
        ByteBuffer put = allocate.put(bArr).put(toByteArray(beaconUID, 10));
        byte[] bArr2 = new byte[6];
        for (int i2 = 0; i2 < 6; i2++) {
            bArr2[i2] = 0;
        }
        byte[] array = put.put(bArr2).array();
        ByteBuffer put2 = ByteBuffer.allocate(18).put(new byte[]{-1}).put(new byte[]{0});
        byte[] bArr3 = new byte[10];
        for (int i3 = 0; i3 < 10; i3++) {
            bArr3[i3] = -1;
        }
        ByteBuffer put3 = put2.put(bArr3);
        byte[] bArr4 = new byte[6];
        for (int i4 = 0; i4 < 6; i4++) {
            bArr4[i4] = 0;
        }
        byte[] array2 = put3.put(bArr4).array();
        ScanFilter.Builder builder = new ScanFilter.Builder();
        ParcelUuid parcelUuid = EDDYSTONE_SERVICE_UUID;
        return builder.setServiceUuid(parcelUuid).setServiceData(parcelUuid, array, array2).build();
    }

    public final RadarBeacon getBeacon(ScanResult result, ScanRecord scanRecord) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(scanRecord, "scanRecord");
        byte[] bytes = scanRecord.getBytes();
        List<ParcelUuid> serviceUuids = scanRecord.getServiceUuids();
        if (serviceUuids != null && serviceUuids.contains(EDDYSTONE_SERVICE_UUID)) {
            Intrinsics.checkNotNull(bytes);
            String hex = toHex(bytes);
            return new RadarBeacon(null, null, null, null, StringsKt.substring(hex, RangesKt.until(26, 46)), StringsKt.substring(hex, RangesKt.until(46, 58)), "", null, Integer.valueOf(result.getRssi()), null, RadarBeacon.RadarBeaconType.EDDYSTONE, 655, null);
        }
        for (int i = 2; i <= 5; i++) {
            if ((bytes[i + 2] & 255) == 2 && (bytes[i + 3] & 255) == 21) {
                ByteBuffer wrap = ByteBuffer.wrap(bytes, i + 4, 20);
                UUID uuid = new UUID(wrap.getLong(), wrap.getLong());
                String valueOf = String.valueOf(((wrap.get() & 255) * 256) + (wrap.get() & 255));
                String valueOf2 = String.valueOf(((wrap.get() & 255) * 256) + (wrap.get() & 255));
                String uuid2 = uuid.toString();
                Intrinsics.checkNotNullExpressionValue(uuid2, "toString(...)");
                return new RadarBeacon(null, null, null, null, uuid2, valueOf, valueOf2, null, Integer.valueOf(result.getRssi()), null, RadarBeacon.RadarBeaconType.IBEACON, 655, null);
            }
        }
        return null;
    }

    private final String toHex(byte[] bytes) {
        char[] cArr = new char[bytes.length * 2];
        int length = bytes.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            int i4 = bytes[i] & 255;
            int i5 = i2 * 2;
            char[] cArr2 = HEX;
            cArr[i5] = cArr2[i4 / 16];
            cArr[i5 + 1] = cArr2[i4 % 16];
            i++;
            i2 = i3;
        }
        return ArraysKt.joinToString$default(cArr, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    private final byte[] toByteArray(String hex, int max) {
        List<String> chunked = StringsKt.chunked(hex, 2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(chunked, 10));
        Iterator<T> it = chunked.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) Integer.parseInt((String) it.next(), CharsKt.checkRadix(16))));
        }
        return ArraysKt.sliceArray(CollectionsKt.toByteArray(arrayList), RangesKt.until(0, max));
    }
}
