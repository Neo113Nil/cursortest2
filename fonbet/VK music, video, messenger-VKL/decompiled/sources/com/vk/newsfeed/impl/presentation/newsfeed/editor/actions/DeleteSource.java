package com.vk.newsfeed.impl.presentation.newsfeed.editor.actions;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RemovePostsWithSameOwnerId.kt */
/* loaded from: classes4.dex */
public final class DeleteSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DeleteSource[] $VALUES;
    public static final DeleteSource CACHE;
    public static final DeleteSource REMOTE;

    static {
        DeleteSource deleteSource = new DeleteSource("CACHE", 0);
        CACHE = deleteSource;
        DeleteSource deleteSource2 = new DeleteSource("REMOTE", 1);
        REMOTE = deleteSource2;
        DeleteSource[] deleteSourceArr = {deleteSource, deleteSource2};
        $VALUES = deleteSourceArr;
        $ENTRIES = new asp(deleteSourceArr);
    }

    public DeleteSource() {
        throw null;
    }

    public static DeleteSource valueOf(String str) {
        return (DeleteSource) Enum.valueOf(DeleteSource.class, str);
    }

    public static DeleteSource[] values() {
        return (DeleteSource[]) $VALUES.clone();
    }
}
