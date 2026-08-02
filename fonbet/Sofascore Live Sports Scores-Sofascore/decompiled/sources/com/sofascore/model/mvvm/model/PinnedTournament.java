package com.sofascore.model.mvvm.model;

import com.sofascore.model.mvvm.IRecent;
import defpackage.wx4;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u001e\u0010\u001e\u001a\u00020\u001f8\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0016¨\u0006%"}, d2 = {"Lcom/sofascore/model/mvvm/model/PinnedTournament;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/IRecent;", "id", "", "name", "", "category", "Lcom/sofascore/model/mvvm/model/Category;", "fieldTranslations", "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "orderIndex", "<init>", "(ILjava/lang/String;Lcom/sofascore/model/mvvm/model/Category;Lcom/sofascore/model/mvvm/model/FieldTranslations;I)V", "tournament", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", "(Lcom/sofascore/model/mvvm/model/UniqueTournament;I)V", "getId", "()I", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getCategory", "()Lcom/sofascore/model/mvvm/model/Category;", "setCategory", "(Lcom/sofascore/model/mvvm/model/Category;)V", "getFieldTranslations", "()Lcom/sofascore/model/mvvm/model/FieldTranslations;", "getOrderIndex", "isRecent", "", "()Z", "setRecent", "(Z)V", "sportSlug", "getSportSlug", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PinnedTournament implements Serializable, IRecent {

    @NotNull
    private Category category;

    @Nullable
    private final FieldTranslations fieldTranslations;
    private final int id;
    private boolean isRecent;

    @Nullable
    private final String name;
    private final int orderIndex;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinnedTournament(@NotNull UniqueTournament uniqueTournament, int i) {
        this(uniqueTournament.getId(), uniqueTournament.getName(), uniqueTournament.getCategory(), uniqueTournament.getFieldTranslations(), i);
        uniqueTournament.getClass();
    }

    @NotNull
    public final Category getCategory() {
        return this.category;
    }

    @Nullable
    public final FieldTranslations getFieldTranslations() {
        return this.fieldTranslations;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    public int getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getOrderIndex() {
        return this.orderIndex;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    @NotNull
    public String getSportSlug() {
        return this.category.getSport().getSlug();
    }

    @Override // com.sofascore.model.mvvm.IRecent
    /* renamed from: isRecent, reason: from getter */
    public boolean getIsRecent() {
        return this.isRecent;
    }

    public final void setCategory(@NotNull Category category) {
        category.getClass();
        this.category = category;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    public void setRecent(boolean z) {
        this.isRecent = z;
    }

    @wx4
    public static /* synthetic */ void getName$annotations() {
    }

    public PinnedTournament(int i, @Nullable String str, @NotNull Category category, @Nullable FieldTranslations fieldTranslations, int i2) {
        category.getClass();
        this.id = i;
        this.name = str;
        this.category = category;
        this.fieldTranslations = fieldTranslations;
        this.orderIndex = i2;
    }
}
