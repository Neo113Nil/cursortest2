package ru.ozon.android.messenger.framework.data;

import We.E;
import android.content.Context;
import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import qj.C9067a;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.blocks.chatlistheader.search.C9327g;
import ru.ozon.android.messenger.blocks.travelOrders.s;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.domain.f;

/* loaded from: classes10.dex */
public final class l implements Jb.e<b> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f87428a;

    /* renamed from: b, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.data.remote.serialize.d f87429b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.f f87430c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.navigation.controller.a> f87431d;

    /* renamed from: e, reason: collision with root package name */
    private final Jb.f f87432e;

    /* renamed from: f, reason: collision with root package name */
    private final Ia0.b f87433f;

    /* renamed from: g, reason: collision with root package name */
    private final Jb.c f87434g;

    /* renamed from: h, reason: collision with root package name */
    private final Jb.f f87435h;

    /* renamed from: i, reason: collision with root package name */
    private final Jb.f f87436i;

    /* renamed from: j, reason: collision with root package name */
    private final Jb.f f87437j;

    /* renamed from: k, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.data.local.q f87438k;

    /* renamed from: l, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.composer.navigation.router.b f87439l;

    public l(Jb.f fVar, ru.ozon.android.messenger.framework.data.remote.serialize.d dVar, Jb.f fVar2, Pc.a aVar, Jb.f fVar3, Ia0.b bVar, Jb.c cVar, Jb.f fVar4, Jb.f fVar5, Jb.f fVar6, ru.ozon.android.messenger.framework.data.local.q qVar, ru.ozon.android.messenger.framework.composer.navigation.router.b bVar2) {
        this.f87428a = fVar;
        this.f87429b = dVar;
        this.f87430c = fVar2;
        this.f87431d = aVar;
        this.f87432e = fVar3;
        this.f87433f = bVar;
        this.f87434g = cVar;
        this.f87435h = fVar4;
        this.f87436i = fVar5;
        this.f87437j = fVar6;
        this.f87438k = qVar;
        this.f87439l = bVar2;
    }

    @Override // Pc.a
    public final Object get() {
        Set<ru.ozon.android.messenger.framework.core.a> customBlocks = (Set) this.f87428a.get();
        JsonParser deserializer = (JsonParser) this.f87429b.get();
        Context context = (Context) this.f87430c.get();
        ru.ozon.android.messenger.framework.navigation.controller.a controller = this.f87431d.get();
        d.b blockCustomSettings = (d.b) this.f87432e.get();
        ru.ozon.android.messenger.blocks.chatGroups.e chatGroupViewParamsDelegate = (ru.ozon.android.messenger.blocks.chatGroups.e) this.f87433f.get();
        ru.ozon.android.messenger.framework.core.c featureProvider = (ru.ozon.android.messenger.framework.core.c) this.f87435h.get();
        E okHttpClient = (E) this.f87436i.get();
        ru.ozon.android.messenger.framework.logger.b bVar = (ru.ozon.android.messenger.framework.logger.b) this.f87437j.get();
        C9067a networkInfoProvider = (C9067a) this.f87438k.get();
        ru.ozon.android.messenger.framework.composer.navigation.router.a composerScreenRouter = (ru.ozon.android.messenger.framework.composer.navigation.router.a) this.f87439l.get();
        Intrinsics.checkNotNullParameter(customBlocks, "customBlocks");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(blockCustomSettings, "blockCustomSettings");
        Intrinsics.checkNotNullParameter(chatGroupViewParamsDelegate, "chatGroupViewParamsDelegate");
        Jb.c blocksItemMapperProvider = this.f87434g;
        Intrinsics.checkNotNullParameter(blocksItemMapperProvider, "blocksItemMapperProvider");
        Intrinsics.checkNotNullParameter(featureProvider, "featureProvider");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(composerScreenRouter, "composerScreenRouter");
        ru.ozon.android.messenger.framework.core.a aVar = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.TEXT.b(), C7714v.b0(new ru.ozon.android.messenger.blocks.messagetext.l(context, deserializer), new ru.ozon.android.messenger.blocks.messagetext.compose.e(context, deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar2 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.FILE.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.messagefile.g(deserializer, okHttpClient, networkInfoProvider)));
        ru.ozon.android.messenger.framework.core.a aVar3 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.FOOTER_INPUT.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.input.c(deserializer, composerScreenRouter)));
        ru.ozon.android.messenger.framework.core.a aVar4 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.HEADER.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.header.p(deserializer, blockCustomSettings)));
        ru.ozon.android.messenger.framework.core.a aVar5 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.IMAGE.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.messageimage.d(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar6 = new ru.ozon.android.messenger.framework.core.a("internal", f.b.UNREAD.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.unreadline.c(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar7 = new ru.ozon.android.messenger.framework.core.a("internal", f.b.PAGINATION_ERROR.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.paginationerror.c(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar8 = new ru.ozon.android.messenger.framework.core.a("internal", f.b.LOADING.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.loading.c(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar9 = new ru.ozon.android.messenger.framework.core.a("internal", f.b.STUB.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.stub.c(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar10 = new ru.ozon.android.messenger.framework.core.a("internal", f.b.DATE.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.date.c(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar11 = new ru.ozon.android.messenger.framework.core.a("internal", f.b.CELL.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.cell.d(context, deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar12 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.ERROR.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.error.d()));
        ru.ozon.android.messenger.framework.core.a aVar13 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.ALERT.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.alert.e(deserializer, context)));
        ru.ozon.android.messenger.framework.core.a aVar14 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.CURTAIN.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.curtain.d(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar15 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.EMPTY_STATE.b(), C7714v.b0(new ru.ozon.android.messenger.blocks.emptystate.i(deserializer), new ru.ozon.android.messenger.blocks.emptystate.v2.j(deserializer), new ru.ozon.android.messenger.blocks.emptystate.v2.d(deserializer), new ru.ozon.android.messenger.blocks.emptystate.v2.f(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar16 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.BUTTONS.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.buttons.d(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar17 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.CHAT.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.chat.old.f(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar18 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.SX_CHAT.b(), C7714v.b0(new ru.ozon.android.messenger.blocks.chat.sx.g(deserializer), new ru.ozon.android.messenger.blocks.chat.ai.d(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar19 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.BX_CHAT.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.chat.bx.e(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar20 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.RATE_OPERATOR.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.rateoperator.c(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar21 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.NOTIFICATION.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.notification.i(deserializer, context)));
        ru.ozon.android.messenger.framework.core.a aVar22 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.CHAT_LIST_HEADER.b(), C7714v.b0(new ru.ozon.android.messenger.blocks.chatlistheader.d(deserializer, blockCustomSettings, bVar), new C9327g(deserializer, blockCustomSettings, bVar)));
        ru.ozon.android.messenger.framework.core.a aVar23 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.DISCLAIMER.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.disclaimer.d(deserializer, context)));
        ru.ozon.android.messenger.framework.core.a aVar24 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.CHAT_GROUP.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.chatGroups.d(deserializer)));
        String b11 = f.b.CHAT_GROUP_LIST.b();
        ru.ozon.android.messenger.blocks.chatGroups.grouplist.j jVar = new ru.ozon.android.messenger.blocks.chatGroups.grouplist.j(deserializer, blocksItemMapperProvider, chatGroupViewParamsDelegate, bVar);
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(blocksItemMapperProvider, "blocksItemMapperProvider");
        ru.ozon.android.messenger.framework.core.a aVar25 = new ru.ozon.android.messenger.framework.core.a("internal", b11, C7714v.b0(jVar, new ru.ozon.android.messenger.blocks.chatGroups.grouplist.g(deserializer, blocksItemMapperProvider)));
        ru.ozon.android.messenger.framework.core.a aVar26 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.SNACKBAR.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.snackbar.c(deserializer, context, featureProvider)));
        ru.ozon.android.messenger.framework.core.a aVar27 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.RATE_MESSENGER.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.ratemessenger.i(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar28 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.COUPON.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.coupon.c(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar29 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.ORDER.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.order.d(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar30 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.TRAVEL_ORDERS.b(), C7714v.a0(new s(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar31 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.RECOMMENDATIONS.b(), C7714v.b0(new ru.ozon.android.messenger.blocks.recommendations.f(deserializer), new ru.ozon.android.messenger.blocks.recommendations.c(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar32 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.ACTION_BUTTON.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.actionButton.c(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar33 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.ORIGINAL_TEXT.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.originalText.g(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar34 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.ONBOARDING.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.onboarding.f(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar35 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.PRODUCT_SHELF.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.productshelf.j(deserializer, controller)));
        ru.ozon.android.messenger.framework.core.a aVar36 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.PINNED_ITEM.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.pinneditem.f(deserializer, blocksItemMapperProvider)));
        ru.ozon.android.messenger.framework.core.a aVar37 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.USER_IS_TYPING.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.useristyping.d(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar38 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.SYSTEM_TEXT.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.systemText.data.b(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar39 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.COURIER_HEADER.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.courierheader.data.b(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar40 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.SEARCH_CHAT.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.chat.search.j(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar41 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.DANGEROUS_TEXT.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.dangerousText.j(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar42 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.AI_CELL_WRAPPER.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.ai.aiCellWrapper.e(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar43 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.SHOW_TEXT_BUTTON.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.showTextButton.p(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar44 = new ru.ozon.android.messenger.framework.core.a("messenger", f.c.FLOAT_BUTTON.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.floatbutton.e(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar45 = new ru.ozon.android.messenger.framework.core.a("messenger", f.a.AI_INPUT.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.ai.input.b(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar46 = new ru.ozon.android.messenger.framework.core.a("messenger", f.a.AI_DIVIDER.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.ai.divider.d(deserializer)));
        ru.ozon.android.messenger.framework.core.a aVar47 = new ru.ozon.android.messenger.framework.core.a("messenger", f.a.AI_EMPTY_STATE.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.ai.aiEmptyState.e(deserializer)));
        f.a aVar48 = f.a.AI_TAP_TAGS;
        ru.ozon.android.messenger.framework.core.a[] elements = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30, aVar31, aVar32, aVar33, aVar34, aVar35, aVar36, aVar37, aVar38, aVar39, aVar40, aVar41, aVar42, aVar43, aVar44, aVar45, aVar46, aVar47, new ru.ozon.android.messenger.framework.core.a("search", aVar48.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.ai.tapTags.b(deserializer))), new ru.ozon.android.messenger.framework.core.a("messenger", aVar48.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.ai.tapTags.b(deserializer))), new ru.ozon.android.messenger.framework.core.a("messenger", f.a.AI_THINKING_INDICATOR.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.d(deserializer))), new ru.ozon.android.messenger.framework.core.a("messenger", f.a.AI_MESSAGE_ACTIONS.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.ai.aiMessageActions.c(deserializer))), new ru.ozon.android.messenger.framework.core.a("messenger", f.a.AI_HEADER.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.ai.header.g(deserializer))), new ru.ozon.android.messenger.framework.core.a("messenger", f.a.AI_FLOATING_BUTTONS.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.floatbutton.ai.e(deserializer))), new ru.ozon.android.messenger.framework.core.a("messenger", f.c.REPLY_OR_EDIT.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.replyInputBlock.d(deserializer))), new ru.ozon.android.messenger.framework.core.a("messenger", f.c.REPLY_MESSAGE.b(), C7714v.a0(new ru.ozon.android.messenger.blocks.replymessageblock.b(deserializer)))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        c cVar = new c(C7705l.j0(elements));
        cVar.d(customBlocks);
        return cVar;
    }
}
