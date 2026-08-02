package ru.ozon.android.messenger.blocks.chat.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.app.android.messenger.databinding.MBlockChatBinding;

/* loaded from: classes10.dex */
public abstract class d<State, VO extends ru.ozon.android.messenger.framework.presentation.models.g> extends ru.ozon.android.messenger.framework.core.viewmapper.a<State, VO, MBlockChatBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockChatBinding> f84511a = a.f84513a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.C1564a f84512b = a.AbstractC1563a.C1564a.f87356a;

    /* synthetic */ class a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockChatBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f84513a = new a(3, MBlockChatBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockChatBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockChatBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockChatBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f84512b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new ru.ozon.android.messenger.blocks.chat.a(context));
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockChatBinding> getInflate() {
        return this.f84511a;
    }
}
