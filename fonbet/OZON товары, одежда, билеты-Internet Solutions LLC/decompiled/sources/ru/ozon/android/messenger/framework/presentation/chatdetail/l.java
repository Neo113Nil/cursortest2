package ru.ozon.android.messenger.framework.presentation.chatdetail;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.messenger.databinding.MFragmentChatBinding;

/* loaded from: classes10.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f89917a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f89918b;

    public l(View view, k kVar) {
        this.f89917a = view;
        this.f89918b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MFragmentChatBinding mFragmentChatBinding;
        int size;
        Function1 function1;
        k kVar = this.f89918b;
        mFragmentChatBinding = kVar.f89888c;
        RecyclerView.o layoutManager = mFragmentChatBinding.messagesRv.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (findFirstVisibleItemPosition == -1 || findLastVisibleItemPosition == -1 || (size = kVar.D().getCurrentList().size()) == 0) {
            return;
        }
        int i11 = size - 1;
        List<ru.ozon.android.messenger.framework.presentation.models.q> subList = kVar.D().getCurrentList().subList(kotlin.ranges.h.e(findFirstVisibleItemPosition, 0, i11), kotlin.ranges.h.e(findLastVisibleItemPosition, 0, i11) + 1);
        function1 = kVar.f89889d;
        function1.invoke(subList);
    }
}
