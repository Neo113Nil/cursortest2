package X8;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;

    /* renamed from: b, reason: collision with root package name */
    public static final a f13621b = new a("CLIPS_PREVIEW_RENDITION_TYPE", 0, "clipsPreviewRenditionType");

    /* renamed from: c, reason: collision with root package name */
    public static final a f13622c = new a("CONFIRMATION_RENDITION_TYPE", 1, "confirmationRenditionType");

    /* renamed from: d, reason: collision with root package name */
    public static final a f13623d = new a("ENABLE_DYNAMIC_TEXT", 2, "enableDynamicText");

    /* renamed from: e, reason: collision with root package name */
    public static final a f13624e = new a("TRAY_HEIGHT_MULTIPLIER", 3, "trayHeightMultiplier");

    /* renamed from: f, reason: collision with root package name */
    public static final a f13625f = new a("MEDIA_TYPE_CONFIG", 4, "mediaTypeConfig");

    /* renamed from: g, reason: collision with root package name */
    public static final a f13626g = new a("RATING", 5, "rating");

    /* renamed from: h, reason: collision with root package name */
    public static final a f13627h = new a("RENDITION_TYPE", 6, "renditionType");

    /* renamed from: i, reason: collision with root package name */
    public static final a f13628i = new a("SELECTED_CONTENT_TYPE", 7, "selectedContentType");

    /* renamed from: j, reason: collision with root package name */
    public static final a f13629j = new a("SHOW_CHECKERED_BACKGROUND", 8, "showCheckeredBackground");

    /* renamed from: k, reason: collision with root package name */
    public static final a f13630k = new a("SHOW_CONFIRMATION_SCREEN", 9, "showConfirmationScreen");

    /* renamed from: l, reason: collision with root package name */
    public static final a f13631l = new a("SHOW_SUGGESTIONS_BAR", 10, "showSuggestionsBar");

    /* renamed from: m, reason: collision with root package name */
    public static final a f13632m = new a("STICKER_COLUMN_COUNT", 11, "stickerColumnCount");

    /* renamed from: n, reason: collision with root package name */
    public static final a f13633n = new a("ENABLE_EDGE_TO_EDGE", 12, "enableEdgeToEdge");

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f13634o;

    /* renamed from: a, reason: collision with root package name */
    public final String f13635a;

    static {
        a[] a10 = a();
        $VALUES = a10;
        f13634o = EnumEntriesKt.enumEntries(a10);
    }

    public a(String str, int i10, String str2) {
        this.f13635a = str2;
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{f13621b, f13622c, f13623d, f13624e, f13625f, f13626g, f13627h, f13628i, f13629j, f13630k, f13631l, f13632m, f13633n};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String b() {
        return this.f13635a;
    }
}
