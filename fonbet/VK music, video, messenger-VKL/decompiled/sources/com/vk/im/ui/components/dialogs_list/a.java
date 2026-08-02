package com.vk.im.ui.components.dialogs_list;

import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.reporters.DialogsFilterChangeSource;
import com.vk.im.ui.components.dialogs_list.InfoModalBottomSheet;

/* compiled from: DialogsListCallback.kt */
/* loaded from: classes2.dex */
public interface a {
    void b(DialogsFilter dialogsFilter, DialogsFilterChangeSource dialogsFilterChangeSource);

    void f(DialogExt dialogExt);

    void g(InfoModalBottomSheet.Params params);

    void h(boolean z);

    void i();

    void o();

    default void j() {
    }

    default void l() {
    }

    default void n() {
    }

    default void c(DialogExt dialogExt) {
    }

    default void k(boolean z) {
    }

    default void m(DialogsFilter dialogsFilter) {
    }
}
