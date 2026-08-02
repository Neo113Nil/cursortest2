package com.vk.core.utils.newtork;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import xsna.asp;
import xsna.bpn0;
import xsna.fr6;
import xsna.izi0;
import xsna.rl3;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NetworkType.kt */
/* loaded from: classes.dex */
public final class NetworkType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NetworkType[] $VALUES;
    public static final NetworkType BLUETOOTH;
    public static final a Companion;
    private static final Lazy<Set<Integer>> EMPTY_TRANSPORT$delegate;
    public static final NetworkType ETHERNET;
    private static final Set<NetworkType> FAST_TYPES;
    private static final Set<NetworkType> GENERAL_TYPES;
    public static final NetworkType LOWPAN;
    public static final NetworkType MOBILE_2G;
    public static final NetworkType MOBILE_3G;
    public static final NetworkType MOBILE_4G;
    public static final NetworkType MOBILE_5G;
    public static final NetworkType MOBILE_FAST_3G;
    private static final Set<NetworkType> MOBILE_TYPES;
    private static final List<NetworkType> SPECIFIC_TYPES;
    private static final Set<Integer> TRANSPORT;
    public static final NetworkType UNKNOWN;
    private static final int UNKNOWN_TRANSPORT = -1;
    public static final NetworkType VPN;
    public static final NetworkType WIFI;
    private final Set<Integer> transport;
    private final Set<Integer> types;

    /* compiled from: NetworkType.kt */
    public static final class a {
    }

    static {
        NetworkType networkType = new NetworkType("MOBILE_2G", 0, Collections.singleton(0), rl3.y0(new Integer[]{7, 4, 2, 1, 11}));
        MOBILE_2G = networkType;
        NetworkType networkType2 = new NetworkType("MOBILE_3G", 1, Collections.singleton(0), rl3.y0(new Integer[]{5, 6, 8, 10, 9, 3, 14, 12, 15}));
        MOBILE_3G = networkType2;
        NetworkType networkType3 = new NetworkType("MOBILE_FAST_3G", 2, Collections.singleton(0), rl3.y0(new Integer[]{8, 9, 3, 14, 12, 15}));
        MOBILE_FAST_3G = networkType3;
        NetworkType networkType4 = new NetworkType("MOBILE_4G", 3, Collections.singleton(0), Collections.singleton(13));
        MOBILE_4G = networkType4;
        NetworkType networkType5 = new NetworkType("MOBILE_5G", 4, Collections.singleton(0), Collections.singleton(20));
        MOBILE_5G = networkType5;
        NetworkType networkType6 = new NetworkType(5, "WIFI", rl3.y0(new Integer[]{1, 5}));
        WIFI = networkType6;
        NetworkType networkType7 = new NetworkType(6, "LOWPAN", Collections.singleton(6));
        LOWPAN = networkType7;
        NetworkType networkType8 = new NetworkType(7, "ETHERNET", Collections.singleton(3));
        ETHERNET = networkType8;
        NetworkType networkType9 = new NetworkType(8, "BLUETOOTH", Collections.singleton(2));
        BLUETOOTH = networkType9;
        NetworkType networkType10 = new NetworkType(9, "VPN", Collections.singleton(4));
        VPN = networkType10;
        NetworkType networkType11 = new NetworkType(10, GrsBaseInfo.CountryCodeSource.UNKNOWN, Collections.singleton(-1));
        UNKNOWN = networkType11;
        NetworkType[] networkTypeArr = {networkType, networkType2, networkType3, networkType4, networkType5, networkType6, networkType7, networkType8, networkType9, networkType10, networkType11};
        $VALUES = networkTypeArr;
        $ENTRIES = new asp(networkTypeArr);
        Companion = new a();
        TRANSPORT = rl3.y0(new Integer[]{0, 1, 2, 3, 4, 5, 6});
        EMPTY_TRANSPORT$delegate = new bpn0(new fr6(9));
        Set<NetworkType> y0 = rl3.y0(new NetworkType[]{networkType, networkType2, networkType3, networkType4, networkType5});
        MOBILE_TYPES = y0;
        GENERAL_TYPES = izi0.j(y0, rl3.y0(new NetworkType[]{networkType6, networkType7, networkType9, networkType8, networkType10}));
        FAST_TYPES = rl3.y0(new NetworkType[]{networkType3, networkType4, networkType5, networkType6, networkType8});
        NetworkType[] values = values();
        ArrayList arrayList = new ArrayList();
        for (NetworkType networkType12 : values) {
            if (networkType12 != UNKNOWN) {
                arrayList.add(networkType12);
            }
        }
        SPECIFIC_TYPES = arrayList;
    }

    public NetworkType(String str, int i, Set set, Set set2) {
        this.transport = set;
        this.types = set2;
    }

    public static NetworkType valueOf(String str) {
        return (NetworkType) Enum.valueOf(NetworkType.class, str);
    }

    public static NetworkType[] values() {
        return (NetworkType[]) $VALUES.clone();
    }

    public final boolean k() {
        return FAST_TYPES.contains(this);
    }

    public final boolean l() {
        return MOBILE_TYPES.contains(this);
    }

    public final boolean m(int i) {
        return this.transport.contains(Integer.valueOf(i));
    }

    public final boolean n(Set<Integer> set) {
        Set<Integer> set2 = set;
        Set<Integer> set3 = this.transport;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            return false;
        }
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            if (set3.contains(Integer.valueOf(((Number) it.next()).intValue()))) {
                return true;
            }
        }
        return false;
    }

    public final boolean o(int i) {
        return this.types.contains(Integer.valueOf(i));
    }

    public NetworkType(int i, String str, Set set) {
        this(str, i, set, Collections.singleton(0));
    }
}
