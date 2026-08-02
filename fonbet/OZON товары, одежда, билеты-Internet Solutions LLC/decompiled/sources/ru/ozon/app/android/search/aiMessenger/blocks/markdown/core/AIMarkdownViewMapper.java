package ru.ozon.app.android.search.aiMessenger.blocks.markdown.core;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.analytics.i;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.c;
import ru.ozon.app.android.search.aiMessenger.blocks.markdown.data.AIMarkdownDTO;
import ru.ozon.app.android.search.aiMessenger.blocks.markdown.presentation.AIMarkdownVO;
import ru.ozon.app.android.search.databinding.ItemMarkwonRecyclerBinding;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B%\b\u0007\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R>\u0010\u0019\u001a&\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u0014j\b\u0012\u0004\u0012\u00020\u0004`\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cRH\u0010!\u001a0\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u001f0\u001dj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004` 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*RB\u0010.\u001a*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020+\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030,0\u001dj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b/\u0010$¨\u00060"}, d2 = {"Lru/ozon/app/android/search/aiMessenger/blocks/markdown/core/AIMarkdownViewMapper;", "Lru/ozon/android/messenger/framework/core/viewmapper/a;", "Lru/ozon/app/android/search/aiMessenger/blocks/markdown/data/AIMarkdownDTO;", "Lru/ozon/app/android/search/aiMessenger/blocks/markdown/presentation/AIMarkdownVO;", "Lru/ozon/app/android/search/databinding/ItemMarkwonRecyclerBinding;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "deserializer", "Lru/ozon/app/android/search/aiMessenger/blocks/markdown/core/AIMarkdownMapper;", "aiMarkdownMapper", "Lru/ozon/android/messenger/framework/analytics/i;", "trackerAnalyticsAdapter", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/search/aiMessenger/blocks/markdown/core/AIMarkdownMapper;Lru/ozon/android/messenger/framework/analytics/i;)V", "Lru/ozon/android/messenger/framework/analytics/i;", "Lru/ozon/android/messenger/framework/core/viewmapper/a$a$a;", "blockContainerSettings", "Lru/ozon/android/messenger/framework/core/viewmapper/a$a$a;", "getBlockContainerSettings", "()Lru/ozon/android/messenger/framework/core/viewmapper/a$a$a;", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "Lru/ozon/android/messenger/framework/core/viewmapper/Inflate;", "inflate", "Lfd/n;", "getInflate", "()Lfd/n;", "Lkotlin/Function2;", "Lru/ozon/android/messenger/framework/core/d;", "Lru/ozon/android/messenger/framework/presentation/common/view/recycler/q;", "Lru/ozon/android/messenger/framework/core/viewmapper/ViewProducer;", "viewProducer", "Lkotlin/jvm/functions/Function2;", "getViewProducer", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/Function1;", "", "parser", "Lkotlin/jvm/functions/Function1;", "getParser", "()Lkotlin/jvm/functions/Function1;", "Lru/ozon/android/messenger/framework/presentation/models/c;", "", "Lru/ozon/android/messenger/framework/core/viewmapper/BlockMapper;", "mapper", "getMapper", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AIMarkdownViewMapper extends a<AIMarkdownDTO, AIMarkdownVO, ItemMarkwonRecyclerBinding> {

    @NotNull
    private final a.AbstractC1563a.C1564a blockContainerSettings;

    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, ItemMarkwonRecyclerBinding> inflate;

    @NotNull
    private final Function2<AIMarkdownDTO, c, List<AIMarkdownVO>> mapper;

    @NotNull
    private final Function1<String, AIMarkdownDTO> parser;

    @NotNull
    private final i trackerAnalyticsAdapter;

    @NotNull
    private final Function2<ItemMarkwonRecyclerBinding, d, q<AIMarkdownVO, ItemMarkwonRecyclerBinding>> viewProducer;

    public AIMarkdownViewMapper(@NotNull JsonParser deserializer, @NotNull AIMarkdownMapper aiMarkdownMapper, @NotNull i trackerAnalyticsAdapter) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(aiMarkdownMapper, "aiMarkdownMapper");
        Intrinsics.checkNotNullParameter(trackerAnalyticsAdapter, "trackerAnalyticsAdapter");
        this.trackerAnalyticsAdapter = trackerAnalyticsAdapter;
        this.blockContainerSettings = a.AbstractC1563a.C1564a.f87356a;
        this.inflate = AIMarkdownViewMapper$inflate$1.INSTANCE;
        this.viewProducer = new AIMarkdownViewMapper$viewProducer$1(this);
        this.parser = new AIMarkdownViewMapper$parser$1(deserializer);
        this.mapper = aiMarkdownMapper;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, ItemMarkwonRecyclerBinding> getInflate() {
        return this.inflate;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public Function2<AIMarkdownDTO, c, List<AIMarkdownVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public Function1<String, AIMarkdownDTO> getParser() {
        return this.parser;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public Function2<ItemMarkwonRecyclerBinding, d, q<AIMarkdownVO, ItemMarkwonRecyclerBinding>> getViewProducer() {
        return this.viewProducer;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public a.AbstractC1563a.C1564a getBlockContainerSettings() {
        return this.blockContainerSettings;
    }
}
