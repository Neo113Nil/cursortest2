package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9464c extends AbstractC7737t implements Function1<ru.ozon.android.messenger.blocks.pinneditem.g, String> {

    /* renamed from: b, reason: collision with root package name */
    public static final C9464c f90059b = new C9464c(1);

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(ru.ozon.android.messenger.blocks.pinneditem.g gVar) {
        ru.ozon.android.messenger.blocks.pinneditem.g gVar2 = gVar;
        if (gVar2 != null) {
            return gVar2.c();
        }
        return null;
    }
}
