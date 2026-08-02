package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public enum bi4 {
    PATTERN_DAY_SHORT("EE", "EE"),
    PATTERN_DAY("EEEE", "EEEE"),
    /* JADX INFO: Fake field, exist only in values array */
    PATTERN_D("d", "d"),
    /* JADX INFO: Fake field, exist only in values array */
    PATTERN_DD("dd", "dd"),
    PATTERN_MM("MMM", "MMM"),
    PATTERN_DM("dd.MM.", "MM/dd"),
    PATTERN_Y("yyyy", "yyyy"),
    PATTERN_Y_SHORT("yy", "yy"),
    PATTERN_MY_SEPARATOR("MM/yyyy", "MM/yyyy"),
    PATTERN_MMY("MMM yyyy", "MMM yyyy"),
    PATTERN_DMM("dd MMM", "MMM dd"),
    PATTERN_DMMHHSS("dd MMM, HH:mm", "MMM dd, HH:mm"),
    PATTERN_DAY_DM("EE dd.MM.", "EE MM/dd"),
    PATTERN_DAY_DMY("EE dd.MM.yyyy.", "EE MM/dd/yyyy"),
    PATTERN_DMMY("d MMM yyyy", "MMM d, yyyy"),
    PATTERN_DDMMY("dd MMM yyyy", "MMM dd, yyyy"),
    PATTERN_DMY("dd.MM.yyyy.", "MM/dd/yyyy"),
    PATTERN_DMY_SHORT("dd.MM.yy.", "MM/dd/yy"),
    PATTERN_MMMMY("LLLL yyyy", "LLLL yyyy"),
    PATTERN_NETWORK_YYMMDD("yyyy-MM-dd", "yyyy-MM-dd"),
    PATTERN_NETWORK_YM("yyyy-MM", "yyyy-MM"),
    PATTERN_NETWORK_MY("MM-yyyy", "MM-yyyy"),
    PATTERN_NETWORK_DMY("dd MMM yyyy", "dd MMM yyyy"),
    PATTERN_DMMMMY("d MMMM yyyy", "MMMM d, yyyy"),
    PATTERN_WEEKDAY_DD_MM("EEE, dd MMMM", "EEE, MMMM dd");

    public final String a;
    public final String b;

    bi4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String d() {
        return zu3.a(ke0.c) ? this.b : this.a;
    }
}
