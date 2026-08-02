package ru.ozon.android.messenger.framework.composer.widgets.di;

import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import k20.C7473e;
import k20.C7475g;
import kotlin.jvm.internal.Intrinsics;
import m20.InterfaceC8046a;
import n20.j;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;
import ru.ozon.android.composerCommonViewKit.header.core.HeaderConfig;
import ru.ozon.android.composerCommonViewKit.header.core.HeaderViewMapper;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

/* loaded from: classes10.dex */
public final class b extends n20.i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsonParser f86830a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ActionHandlersFactory f86831b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long[] jArr, JsonParser jsonParser, ActionHandlersFactory actionHandlersFactory) {
        super("common", CommentV3DTO.HEADER_FIELD_NAME, jArr);
        this.f86830a = jsonParser;
        this.f86831b = actionHandlersFactory;
    }

    @Override // n20.i
    public final InterfaceC7243a<? extends Object> config(C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new HeaderConfig(this.f86830a);
    }

    @Override // n20.i
    public final InterfaceC8046a<?, ? extends l20.c>[] viewMappers(C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new HeaderViewMapper[]{new HeaderViewMapper(this.f86831b)};
    }

    @Override // n20.i
    public final C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return j.a();
    }
}
