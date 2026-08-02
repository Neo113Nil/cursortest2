package ru.ozon.fintech.ui.radio;

import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements InterfaceC6511n {
    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Unit clickListener$lambda$1$lambda$0;
        clickListener$lambda$1$lambda$0 = RadioWrapperView.clickListener$lambda$1$lambda$0((Function2) obj, (String) obj2, ((Boolean) obj3).booleanValue());
        return clickListener$lambda$1$lambda$0;
    }
}
