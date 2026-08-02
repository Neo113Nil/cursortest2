package com.yandex.runtime.sensors.internal.telephony;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class GsmCellInfo implements Serializable {
    private int cid;
    private Integer earfcn;
    private int lac;
    private int mcc;
    private int mnc;
    private Integer pci;
    private int strength;
    private long timestampMilliseconds;
    private Integer timingAdvance;
    private CellType type;

    public GsmCellInfo(int i11, int i12, int i13, int i14, int i15, Integer num, CellType cellType, long j11, Integer num2, Integer num3) {
        this.cid = i11;
        this.lac = i12;
        this.strength = i13;
        this.mcc = i14;
        this.mnc = i15;
        this.timingAdvance = num;
        this.type = cellType;
        this.timestampMilliseconds = j11;
        this.pci = num2;
        this.earfcn = num3;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.cid = archive.add(this.cid);
        this.lac = archive.add(this.lac);
        this.strength = archive.add(this.strength);
        this.mcc = archive.add(this.mcc);
        this.mnc = archive.add(this.mnc);
        this.timingAdvance = archive.add(this.timingAdvance, true);
        this.type = (CellType) archive.add((Archive) this.type, false, (Class<Archive>) CellType.class);
        this.timestampMilliseconds = archive.add(this.timestampMilliseconds);
        this.pci = archive.add(this.pci, true);
        this.earfcn = archive.add(this.earfcn, true);
    }
}
