package com.sofascore.model.firebase;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/sofascore/model/firebase/RemoteConfigParameterLine;", "", "text", "", "level", "Lcom/sofascore/model/firebase/ParamJsonDepthLevel;", "<init>", "(Ljava/lang/String;Lcom/sofascore/model/firebase/ParamJsonDepthLevel;)V", "getText", "()Ljava/lang/String;", "getLevel", "()Lcom/sofascore/model/firebase/ParamJsonDepthLevel;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RemoteConfigParameterLine {

    @NotNull
    private final ParamJsonDepthLevel level;

    @NotNull
    private final String text;

    public RemoteConfigParameterLine(@NotNull String str, @NotNull ParamJsonDepthLevel paramJsonDepthLevel) {
        str.getClass();
        paramJsonDepthLevel.getClass();
        this.text = str;
        this.level = paramJsonDepthLevel;
    }

    public static /* synthetic */ RemoteConfigParameterLine copy$default(RemoteConfigParameterLine remoteConfigParameterLine, String str, ParamJsonDepthLevel paramJsonDepthLevel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = remoteConfigParameterLine.text;
        }
        if ((i & 2) != 0) {
            paramJsonDepthLevel = remoteConfigParameterLine.level;
        }
        return remoteConfigParameterLine.copy(str, paramJsonDepthLevel);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ParamJsonDepthLevel getLevel() {
        return this.level;
    }

    @NotNull
    public final RemoteConfigParameterLine copy(@NotNull String text, @NotNull ParamJsonDepthLevel level) {
        text.getClass();
        level.getClass();
        return new RemoteConfigParameterLine(text, level);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteConfigParameterLine)) {
            return false;
        }
        RemoteConfigParameterLine remoteConfigParameterLine = (RemoteConfigParameterLine) other;
        return Intrinsics.c(this.text, remoteConfigParameterLine.text) && this.level == remoteConfigParameterLine.level;
    }

    @NotNull
    public final ParamJsonDepthLevel getLevel() {
        return this.level;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.level.hashCode() + (this.text.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "RemoteConfigParameterLine(text=" + this.text + ", level=" + this.level + ")";
    }
}
