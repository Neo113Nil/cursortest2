package defpackage;

import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.newNetwork.TyreType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class gwc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ServerType.values().length];
        try {
            iArr[ServerType.SEASON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ServerType.PRACTICE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ServerType.QUALIFYING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ServerType.RACE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ServerType.SPRINT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ServerType.DISCIPLINE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[TyreType.values().length];
        try {
            iArr2[TyreType.HARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[TyreType.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[TyreType.SOFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[TyreType.WET.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[TyreType.INTERMEDIATE.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        a = iArr2;
    }
}
