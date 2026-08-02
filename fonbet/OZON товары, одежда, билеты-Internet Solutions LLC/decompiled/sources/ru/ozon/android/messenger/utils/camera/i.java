package ru.ozon.android.messenger.utils.camera;

import android.content.DialogInterface;
import androidx.appcompat.app.f;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.messenger.R$string;

/* loaded from: classes10.dex */
final class i extends AbstractC7737t implements Function2<ComponentCallbacksC5392m, String, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f91853b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(e eVar) {
        super(2);
        this.f91853b = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(ComponentCallbacksC5392m componentCallbacksC5392m, String str) {
        final ComponentCallbacksC5392m fragment = componentCallbacksC5392m;
        String reason = str;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(reason, "reason");
        boolean d11 = Intrinsics.d(reason, "android.permission.CAMERA");
        e eVar = this.f91853b;
        if (d11) {
            final g onPositiveButton = new g(eVar);
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(onPositiveButton, "onPositiveButton");
            androidx.appcompat.app.f create = new f.a(fragment.requireContext()).setTitle(fragment.getResources().getString(R$string.messenger_error_no_camera_access)).f(fragment.getResources().getString(R$string.messenger_allow_camera_access)).m(fragment.getResources().getString(R$string.messenger_go_to_settings), new DialogInterface.OnClickListener() { // from class: ru.ozon.android.messenger.utils.camera.m
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    ((g) Function0.this).invoke();
                    ComponentCallbacksC5392m componentCallbacksC5392m2 = fragment;
                    Intrinsics.checkNotNullParameter(componentCallbacksC5392m2, "<this>");
                    r activity = componentCallbacksC5392m2.getActivity();
                    if (activity != null) {
                        Ki.a.a(activity);
                    }
                }
            }).setNegativeButton(R$string.messenger_cancel_button_android, null).create();
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            new k(fragment, create).c();
        } else {
            final h onPositiveButton2 = new h(eVar);
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(onPositiveButton2, "onPositiveButton");
            androidx.appcompat.app.f create2 = new f.a(fragment.requireContext()).setTitle(fragment.getResources().getString(R$string.messenger_error_photo_access)).f(fragment.getResources().getString(R$string.messenger_allow_photo_access)).m(fragment.getResources().getString(R$string.messenger_go_to_settings), new DialogInterface.OnClickListener() { // from class: ru.ozon.android.messenger.utils.camera.l
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    ((h) Function0.this).invoke();
                    ComponentCallbacksC5392m componentCallbacksC5392m2 = fragment;
                    Intrinsics.checkNotNullParameter(componentCallbacksC5392m2, "<this>");
                    r activity = componentCallbacksC5392m2.getActivity();
                    if (activity != null) {
                        Ki.a.a(activity);
                    }
                }
            }).setNegativeButton(R$string.messenger_cancel_button_android, null).create();
            Intrinsics.checkNotNullExpressionValue(create2, "create(...)");
            new k(fragment, create2).c();
        }
        return Unit.f71690a;
    }
}
