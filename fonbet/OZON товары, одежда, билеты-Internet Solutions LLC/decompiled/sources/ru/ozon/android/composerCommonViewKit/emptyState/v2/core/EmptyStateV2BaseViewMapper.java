package ru.ozon.android.composerCommonViewKit.emptyState.v2.core;

import Xc.a;
import Xc.b;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.model.EmptyStateV2TopPartModel;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateV2TopPartVO;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateV2ViewHolder;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001+B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0014\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\u0004\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R&\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R,\u0010*\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00130&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)¨\u0006,"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/core/EmptyStateV2BaseViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/EmptyStateV2TopPartModel;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2TopPartVO;", "<init>", "()V", "Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "actionHandlersFactory", "(Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;)V", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/EmptyStateV2TopPartModel;Ll20/d;)Ljava/util/List;", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2TopPartVO;Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2TopPartVO;)Ljava/lang/Object;", "Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "", "tag", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "mapper", "EmptyStateV2Payload", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class EmptyStateV2BaseViewMapper extends g<EmptyStateV2TopPartModel, EmptyStateV2TopPartVO> {
    private ActionHandlersFactory actionHandlersFactory;

    @NotNull
    private final Function2<View, i, EmptyStateV2ViewHolder> holderProducer;
    private final Integer layout;

    @NotNull
    private final Function2<EmptyStateV2TopPartModel, d, List<EmptyStateV2TopPartVO>> mapper;
    private final String tag;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/core/EmptyStateV2BaseViewMapper$EmptyStateV2Payload;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE", SelectionItemDescriptionDTO.TITLE, "MESSAGE", "BACKGROUND", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EmptyStateV2Payload {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ EmptyStateV2Payload[] $VALUES;
        public static final EmptyStateV2Payload IMAGE = new EmptyStateV2Payload("IMAGE", 0);
        public static final EmptyStateV2Payload TITLE = new EmptyStateV2Payload(SelectionItemDescriptionDTO.TITLE, 1);
        public static final EmptyStateV2Payload MESSAGE = new EmptyStateV2Payload("MESSAGE", 2);
        public static final EmptyStateV2Payload BACKGROUND = new EmptyStateV2Payload("BACKGROUND", 3);

        private static final /* synthetic */ EmptyStateV2Payload[] $values() {
            return new EmptyStateV2Payload[]{IMAGE, TITLE, MESSAGE, BACKGROUND};
        }

        static {
            EmptyStateV2Payload[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private EmptyStateV2Payload(String str, int i11) {
        }

        public static EmptyStateV2Payload valueOf(String str) {
            return (EmptyStateV2Payload) Enum.valueOf(EmptyStateV2Payload.class, str);
        }

        public static EmptyStateV2Payload[] values() {
            return (EmptyStateV2Payload[]) $VALUES.clone();
        }
    }

    protected EmptyStateV2BaseViewMapper() {
        this.holderProducer = new EmptyStateV2BaseViewMapper$holderProducer$1(this);
        this.mapper = EmptyStateV2BaseViewMapper$mapper$1.INSTANCE;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<EmptyStateV2TopPartVO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return this.holderProducer.invoke(view, container);
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    public String getTag() {
        return this.tag;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull EmptyStateV2TopPartVO oldItem, @NotNull EmptyStateV2TopPartVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (!Intrinsics.d(oldItem.getImage(), newItem.getImage())) {
            arrayList.add(EmptyStateV2Payload.IMAGE);
        }
        if (!Intrinsics.d(oldItem.getTitle(), newItem.getTitle())) {
            arrayList.add(EmptyStateV2Payload.TITLE);
        }
        if (!Intrinsics.d(oldItem.getMessage(), newItem.getMessage())) {
            arrayList.add(EmptyStateV2Payload.MESSAGE);
        }
        if (!Intrinsics.d(oldItem.getBackgroundColor(), newItem.getBackgroundColor())) {
            arrayList.add(EmptyStateV2Payload.BACKGROUND);
        }
        return arrayList;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<EmptyStateV2TopPartVO> map(@NotNull EmptyStateV2TopPartModel state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.mapper.invoke(state, info);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    protected EmptyStateV2BaseViewMapper(@NotNull ActionHandlersFactory actionHandlersFactory) {
        this();
        Intrinsics.checkNotNullParameter(actionHandlersFactory, "actionHandlersFactory");
        this.actionHandlersFactory = actionHandlersFactory;
    }
}
