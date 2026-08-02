package androidx.compose.foundation.text;

import android.R;
import xsna.asp;
import xsna.s200;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonContextMenuArea.kt */
/* loaded from: classes11.dex */
public final class TextContextMenuItems {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TextContextMenuItems[] $VALUES;
    public static final TextContextMenuItems Autofill;
    public static final TextContextMenuItems Copy;
    public static final TextContextMenuItems Cut;
    public static final TextContextMenuItems Paste;
    public static final TextContextMenuItems SelectAll;
    private final int drawableId;
    private final Object key;
    private final int stringId;

    static {
        TextContextMenuItems textContextMenuItems = new TextContextMenuItems(0, R.string.cut, R.attr.actionModeCutDrawable, "Cut", s200.h);
        Cut = textContextMenuItems;
        TextContextMenuItems textContextMenuItems2 = new TextContextMenuItems(1, R.string.copy, R.attr.actionModeCopyDrawable, "Copy", s200.i);
        Copy = textContextMenuItems2;
        TextContextMenuItems textContextMenuItems3 = new TextContextMenuItems(2, R.string.paste, R.attr.actionModePasteDrawable, "Paste", s200.j);
        Paste = textContextMenuItems3;
        TextContextMenuItems textContextMenuItems4 = new TextContextMenuItems(3, R.string.selectAll, R.attr.actionModeSelectAllDrawable, "SelectAll", s200.k);
        SelectAll = textContextMenuItems4;
        TextContextMenuItems textContextMenuItems5 = new TextContextMenuItems(4, R.string.autofill, 0, "Autofill", s200.l);
        Autofill = textContextMenuItems5;
        TextContextMenuItems[] textContextMenuItemsArr = {textContextMenuItems, textContextMenuItems2, textContextMenuItems3, textContextMenuItems4, textContextMenuItems5};
        $VALUES = textContextMenuItemsArr;
        $ENTRIES = new asp(textContextMenuItemsArr);
    }

    public TextContextMenuItems(int i, int i2, int i3, String str, Object obj) {
        this.key = obj;
        this.stringId = i2;
        this.drawableId = i3;
    }

    public static TextContextMenuItems valueOf(String str) {
        return (TextContextMenuItems) Enum.valueOf(TextContextMenuItems.class, str);
    }

    public static TextContextMenuItems[] values() {
        return (TextContextMenuItems[]) $VALUES.clone();
    }

    public final int h() {
        return this.drawableId;
    }

    public final Object i() {
        return this.key;
    }

    public final int j() {
        return this.stringId;
    }
}
