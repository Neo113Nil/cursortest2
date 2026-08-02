package ru.ozon.fintech.ui.misc;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/fintech/ui/misc/FinIcons;", "", "drawableName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDrawableName", "()Ljava/lang/String;", "IC_M_DOWNLOAD_FILLED", "IC_M_SHARE_ARROW_FILLED", "IC_M_CONFIRMED_FILLED", "IC_M_EXCLAMATION_FILLED", "IC_M_RELOAD_FILLED", "IC_M_CIRCLE_DOWNLOAD_FILLED", "IC_M_KEY_FILLED", "IC_M_GALLERY", "IC_M_DOCUMENT_FILLED", "IC_S_CHEVRON_RIGHT", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FinIcons {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FinIcons[] $VALUES;

    @NotNull
    private final String drawableName;
    public static final FinIcons IC_M_DOWNLOAD_FILLED = new FinIcons("IC_M_DOWNLOAD_FILLED", 0, "ic_m_download_filled");
    public static final FinIcons IC_M_SHARE_ARROW_FILLED = new FinIcons("IC_M_SHARE_ARROW_FILLED", 1, "ic_m_share_arrow_filled");
    public static final FinIcons IC_M_CONFIRMED_FILLED = new FinIcons("IC_M_CONFIRMED_FILLED", 2, "ic_m_confirmed_filled");
    public static final FinIcons IC_M_EXCLAMATION_FILLED = new FinIcons("IC_M_EXCLAMATION_FILLED", 3, "ic_m_exclamation_filled");
    public static final FinIcons IC_M_RELOAD_FILLED = new FinIcons("IC_M_RELOAD_FILLED", 4, "ic_m_reload_filled");
    public static final FinIcons IC_M_CIRCLE_DOWNLOAD_FILLED = new FinIcons("IC_M_CIRCLE_DOWNLOAD_FILLED", 5, "ic_m_circle_download_filled");
    public static final FinIcons IC_M_KEY_FILLED = new FinIcons("IC_M_KEY_FILLED", 6, "ic_m_key_filled");
    public static final FinIcons IC_M_GALLERY = new FinIcons("IC_M_GALLERY", 7, "ic_m_gallery");
    public static final FinIcons IC_M_DOCUMENT_FILLED = new FinIcons("IC_M_DOCUMENT_FILLED", 8, "ic_m_document_filled");
    public static final FinIcons IC_S_CHEVRON_RIGHT = new FinIcons("IC_S_CHEVRON_RIGHT", 9, "ic_s_chevron_right");

    private static final /* synthetic */ FinIcons[] $values() {
        return new FinIcons[]{IC_M_DOWNLOAD_FILLED, IC_M_SHARE_ARROW_FILLED, IC_M_CONFIRMED_FILLED, IC_M_EXCLAMATION_FILLED, IC_M_RELOAD_FILLED, IC_M_CIRCLE_DOWNLOAD_FILLED, IC_M_KEY_FILLED, IC_M_GALLERY, IC_M_DOCUMENT_FILLED, IC_S_CHEVRON_RIGHT};
    }

    static {
        FinIcons[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private FinIcons(String str, int i11, String str2) {
        this.drawableName = str2;
    }

    @NotNull
    public static a<FinIcons> getEntries() {
        return $ENTRIES;
    }

    public static FinIcons valueOf(String str) {
        return (FinIcons) Enum.valueOf(FinIcons.class, str);
    }

    public static FinIcons[] values() {
        return (FinIcons[]) $VALUES.clone();
    }

    @NotNull
    public final String getDrawableName() {
        return this.drawableName;
    }
}
