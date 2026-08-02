package com.sofascore.model.database;

import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/sofascore/model/database/MediaReactionType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "THUMBS_UP", "REMOVE_THUMBS_UP", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MediaReactionType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ MediaReactionType[] $VALUES;

    @NotNull
    private final String type;
    public static final MediaReactionType THUMBS_UP = new MediaReactionType("THUMBS_UP", 0, "thumbsup");
    public static final MediaReactionType REMOVE_THUMBS_UP = new MediaReactionType("REMOVE_THUMBS_UP", 1, "remove_thumbsup");

    private static final /* synthetic */ MediaReactionType[] $values() {
        return new MediaReactionType[]{THUMBS_UP, REMOVE_THUMBS_UP};
    }

    static {
        MediaReactionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private MediaReactionType(String str, int i, String str2) {
        this.type = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static MediaReactionType valueOf(String str) {
        return (MediaReactionType) Enum.valueOf(MediaReactionType.class, str);
    }

    public static MediaReactionType[] values() {
        return (MediaReactionType[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
