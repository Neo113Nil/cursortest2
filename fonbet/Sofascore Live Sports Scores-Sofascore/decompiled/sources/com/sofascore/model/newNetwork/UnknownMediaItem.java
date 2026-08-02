package com.sofascore.model.newNetwork;

import defpackage.joa;
import defpackage.qq3;
import defpackage.r5h;
import defpackage.vak;
import defpackage.ypa;
import defpackage.ysa;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0014\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005HÖ\u0083\u0004J\n\u0010\t\u001a\u00020\nHÖ\u0081\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\fJ\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004¨\u0006\u000f"}, d2 = {"Lcom/sofascore/model/newNetwork/UnknownMediaItem;", "Lcom/sofascore/model/newNetwork/IHighlightMediaItem;", "<init>", "()V", "readResolve", "", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UnknownMediaItem implements IHighlightMediaItem {

    @NotNull
    public static final UnknownMediaItem INSTANCE = new UnknownMediaItem();
    private static final /* synthetic */ joa $cachedSerializer$delegate = ypa.a(ysa.b, new vak(20));

    private UnknownMediaItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new qq3("com.sofascore.model.newNetwork.UnknownMediaItem", INSTANCE, new Annotation[0]);
    }

    private final /* synthetic */ KSerializer get$cachedSerializer() {
        return (KSerializer) $cachedSerializer$delegate.getValue();
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    public boolean equals(@Nullable Object other) {
        return this == other || (other instanceof UnknownMediaItem);
    }

    @Override // com.sofascore.model.newNetwork.IHighlightMediaItem
    @Nullable
    /* renamed from: getId */
    public /* bridge */ Integer mo689getId() {
        return super.mo689getId();
    }

    @Override // com.sofascore.model.newNetwork.IHighlightMediaItem
    @Nullable
    public /* bridge */ String getSubtitle() {
        return super.getSubtitle();
    }

    @Override // com.sofascore.model.newNetwork.IHighlightMediaItem
    @Nullable
    public /* bridge */ String getThumbnailUrl() {
        return super.getThumbnailUrl();
    }

    @Override // com.sofascore.model.newNetwork.IHighlightMediaItem
    @Nullable
    public /* bridge */ String getTitle() {
        return super.getTitle();
    }

    @Override // com.sofascore.model.newNetwork.IHighlightMediaItem
    @Nullable
    public /* bridge */ String getVideoUrl() {
        return super.getVideoUrl();
    }

    public int hashCode() {
        return -1241779448;
    }

    @NotNull
    public final KSerializer serializer() {
        return get$cachedSerializer();
    }

    @NotNull
    public String toString() {
        return "UnknownMediaItem";
    }
}
