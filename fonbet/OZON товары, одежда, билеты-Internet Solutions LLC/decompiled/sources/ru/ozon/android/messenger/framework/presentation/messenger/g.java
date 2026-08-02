package ru.ozon.android.messenger.framework.presentation.messenger;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.messenger.databinding.MFragmentMessengerBinding;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/android/messenger/framework/presentation/messenger/g;", "Lru/ozon/android/messenger/framework/presentation/common/screen/i;", "Lru/ozon/app/android/messenger/databinding/MFragmentMessengerBinding;", "<init>", "()V", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public class g extends ru.ozon.android.messenger.framework.presentation.common.screen.i<MFragmentMessengerBinding> {

    /* synthetic */ class a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MFragmentMessengerBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f91356a = new a(3, MFragmentMessengerBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MFragmentMessengerBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MFragmentMessengerBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MFragmentMessengerBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    public g() {
        super(a.f91356a);
    }
}
