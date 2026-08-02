package com.vk.richcontent.api;

import android.content.ClipDescription;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.asp;
import xsna.rl3;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MimeType.kt */
/* loaded from: classes5.dex */
public final class MimeType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MimeType[] $VALUES;
    public static final MimeType DOCUMENT;
    public static final MimeType IMAGE;
    public static final MimeType TEXT;
    private final Set<String> blacklisted;
    private final Set<String> patterns;
    private final Set<String> whitelisted;

    static {
        Set singleton = Collections.singleton("image/*");
        Set y0 = rl3.y0(new String[]{"vnd.android.cursor.item/image", "vnd.android.cursor.dir/image"});
        EmptySet emptySet = EmptySet.b;
        MimeType mimeType = new MimeType("IMAGE", 0, singleton, y0, emptySet);
        IMAGE = mimeType;
        MimeType mimeType2 = new MimeType("DOCUMENT", 1, Collections.singleton("application/*"), emptySet, emptySet);
        DOCUMENT = mimeType2;
        MimeType mimeType3 = new MimeType("TEXT", 2, Collections.singleton("text/*"), emptySet, emptySet);
        TEXT = mimeType3;
        MimeType[] mimeTypeArr = {mimeType, mimeType2, mimeType3};
        $VALUES = mimeTypeArr;
        $ENTRIES = new asp(mimeTypeArr);
    }

    public MimeType(String str, int i, Set set, Set set2, Set set3) {
        this.patterns = set;
        this.whitelisted = set2;
        this.blacklisted = set3;
    }

    public static MimeType valueOf(String str) {
        return (MimeType) Enum.valueOf(MimeType.class, str);
    }

    public static MimeType[] values() {
        return (MimeType[]) $VALUES.clone();
    }

    public final boolean a(String str) {
        if (str == null) {
            return false;
        }
        if (this.whitelisted.contains(str)) {
            return true;
        }
        if (this.blacklisted.contains(str)) {
            return false;
        }
        Set<String> set = this.patterns;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (ClipDescription.compareMimeTypes(str, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final Set<String> h() {
        return this.patterns;
    }
}
