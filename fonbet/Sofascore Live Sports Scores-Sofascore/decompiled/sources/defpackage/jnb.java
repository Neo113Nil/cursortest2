package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jnb {
    public static final /* synthetic */ jnb[] a = {new jnb("REFEREE_STOPS_CONTEST", 0), new jnb("WALKOVER", 1), new jnb("ABANDON", 2), new jnb("UNANIMOUS_DECISION", 3), new jnb("MAJORITY_DECISION", 4), new jnb("SPLIT_DECISION", 5), new jnb("DECISION", 6), new jnb("RETIRED", 7), new jnb("POINTS", 8), new jnb("KNOCKOUT", 9), new jnb("TECHNICAL_KNOCKOUT", 10), new jnb("SUBMISSION", 11), new jnb("TECHNICAL_SUBMISSION", 12), new jnb("NO_CONTEST", 13), new jnb("DISQUALIFICATION", 14), new jnb("FORFEIT", 15), new jnb("INJURY", 16)};

    /* JADX INFO: Fake field, exist only in values array */
    jnb EF5;

    public static jnb valueOf(String str) {
        return (jnb) Enum.valueOf(jnb.class, str);
    }

    public static jnb[] values() {
        return (jnb[]) a.clone();
    }
}
