package com.vk.documents.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.O6;
import com.vk.api.base.Document;
import com.vk.api.base.VkPaginationList;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.documents.impl.SearchDocumentsListFragment;
import com.vk.documents.impl.TypedDocumentsListFragment;
import com.vk.dto.common.id.UserId;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.upload.impl.UploadNotification;
import com.vk.upload.impl.tasks.i;
import com.vkontakte.android.R;
import com.vkontakte.android.api.DocsGetTypesResult;
import com.vkontakte.android.fragments.VkTabbedLoaderFragment;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.a0a;
import xsna.abg0;
import xsna.asu0;
import xsna.baf0;
import xsna.bfm;
import xsna.bk1;
import xsna.dhr0;
import xsna.dvn;
import xsna.e43;
import xsna.eun;
import xsna.gvn;
import xsna.j6i;
import xsna.m3g;
import xsna.m7m;
import xsna.ne9;
import xsna.o25;
import xsna.p0e0;
import xsna.qj80;
import xsna.s3q0;
import xsna.sf;
import xsna.t2i0;
import xsna.u1u0;
import xsna.w8i;
import xsna.wmi0;
import xsna.ysg0;

/* loaded from: classes.dex */
public class DocumentsViewFragment extends VkTabbedLoaderFragment implements eun, w8i {
    public static final /* synthetic */ int x0 = 0;
    public List<TypedDocumentsListFragment> m0;
    public boolean o0;
    public final baf0 s0;
    public final baf0 t0;
    public final a u0;
    public final b v0;
    public final c w0;
    public final io.reactivex.rxjava3.disposables.b n0 = new io.reactivex.rxjava3.disposables.b();
    public UserId p0 = UserId.d;
    public final DocumentsViewFragment q0 = this;
    public final dvn r0 = new dvn();

    /* loaded from: classes18.dex */
    public class a implements f<DocsGetTypesResult> {
        public a() {
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(DocsGetTypesResult docsGetTypesResult) throws Throwable {
            VkPaginationList<Document> vkPaginationList;
            DocsGetTypesResult docsGetTypesResult2 = docsGetTypesResult;
            DocumentsViewFragment documentsViewFragment = DocumentsViewFragment.this;
            UserId userId = documentsViewFragment.p0;
            VkPaginationList<Document> vkPaginationList2 = docsGetTypesResult2.a;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = docsGetTypesResult2.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DocsGetTypesResult.DocType docType = (DocsGetTypesResult.DocType) it.next();
                int h = docType.a.h();
                DocsGetTypesResult.DocType.Type type = DocsGetTypesResult.DocType.Type.ALL;
                int i = h == type.h() ? vkPaginationList2.c : docType.b;
                if (h == type.h()) {
                    vkPaginationList = vkPaginationList2;
                } else {
                    ArrayList arrayList3 = new ArrayList(i);
                    for (Document document : vkPaginationList2.b) {
                        if (document.i == h) {
                            arrayList3.add(document);
                        }
                    }
                    vkPaginationList = new VkPaginationList<>(arrayList3, i, arrayList3.size() < i, 0, 8, null);
                }
                TypedDocumentsListFragment.a aVar = new TypedDocumentsListFragment.a();
                Bundle bundle = aVar.j;
                bundle.putParcelable("owner_id", userId);
                bundle.putInt("type_id", h);
                bundle.putParcelable(O6.C0, vkPaginationList);
                arrayList.add((TypedDocumentsListFragment) aVar.f());
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                arrayList2.add(context.getString(docType.a.i()));
            }
            Pair pair = new Pair(arrayList, arrayList2);
            documentsViewFragment.o0 = docsGetTypesResult2.c;
            documentsViewFragment.invalidateOptionsMenu();
            List<TypedDocumentsListFragment> list = (List) pair.i();
            documentsViewFragment.m0 = list;
            documentsViewFragment.l0.o(list, (List) pair.j());
            Iterator<TypedDocumentsListFragment> it2 = documentsViewFragment.m0.iterator();
            while (it2.hasNext()) {
                it2.next().c0 = documentsViewFragment.q0;
            }
            documentsViewFragment.oo();
            documentsViewFragment.invalidateOptionsMenu();
            Bundle arguments = documentsViewFragment.getArguments();
            if (arguments == null || !arguments.getBoolean("open_for_add", false)) {
                return;
            }
            documentsViewFragment.vo();
            arguments.remove("open_for_add");
        }
    }

    /* loaded from: classes18.dex */
    public class b implements f<DocsGetTypesResult> {
        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(DocsGetTypesResult docsGetTypesResult) throws Throwable {
            wmi0.a.a("userDocs", docsGetTypesResult.a);
        }
    }

    /* loaded from: classes18.dex */
    public class c implements f<Throwable> {
        public c() {
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(Throwable th) throws Throwable {
            Throwable th2 = th;
            if (th2 instanceof VKApiExecutionException) {
                DocumentsViewFragment documentsViewFragment = DocumentsViewFragment.this;
                if (th2 != null) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th2;
                    if (vKApiExecutionException.T() && SakFeatures.Type.NEW_GEOBLOCK_ERROR.h()) {
                        Bundle w = vKApiExecutionException.w();
                        long j = w != null ? w.getLong("owner_id") : 0L;
                        if (j != 0) {
                            ((ProfileFragmentProviderComponent) j6i.b(m7m.f(documentsViewFragment), ProfileFragmentProviderComponent.class)).E7(j).k(documentsViewFragment.mo2getContext());
                            documentsViewFragment.finish();
                            s3q0 s3q0Var = s3q0.a;
                            return;
                        }
                        return;
                    }
                }
                documentsViewFragment.onError((VKApiExecutionException) th2);
                u1u0.n(0, documentsViewFragment.a0);
                u1u0.n(8, documentsViewFragment.b0);
            }
        }
    }

    public DocumentsViewFragment() {
        abg0 abg0Var = dhr0.t;
        this.s0 = abg0Var.b(R.drawable.vk_icon_picture_outline_28, R.attr.vk_ui_icon_accent);
        this.t0 = abg0Var.b(R.drawable.vk_icon_upload_outline_28, R.attr.vk_ui_icon_accent);
        this.u0 = new a();
        this.v0 = new b();
        this.w0 = new c();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return;
        }
        ArrayList c2 = gvn.c(i, intent);
        if (c2.isEmpty()) {
            return;
        }
        Iterator it = c2.iterator();
        while (it.hasNext()) {
            i iVar = new i(((PendingDocumentAttachment) it.next()).g, this.p0, false, true);
            com.vk.upload.impl.a.g(iVar, new UploadNotification.a(t2i0.a(kn(), 0, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("vkontakte://" + a0a.d + "/docs" + this.p0)), 33554432), getString(R.string.doc_upload_ok), getString(R.string.doc_upload_ok_long)));
            com.vk.upload.impl.a.i(iVar);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.p0 = (UserId) arguments.getParcelable("owner_id");
        }
        if (this.p0 == null) {
            this.p0 = o25.a().o().a;
        }
        this.o0 = o25.a().a(this.p0);
        invalidateOptionsMenu();
        p0e0.b(this.p0, "docs_group");
    }

    @Override // me.grishka.appkit.fragments.TabbedLoaderFragment, androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        MenuItem findItem;
        MenuItem findItem2;
        if (this.o0 || this.f0) {
            menuInflater.inflate(R.menu.documents, menu);
        }
        int c2 = dhr0.t.c(R.attr.vk_ui_icon_accent_themed);
        if (this.o0 && (findItem2 = menu.findItem(R.id.documents_add)) != null) {
            findItem2.setVisible(true);
            findItem2.getIcon().setTint(c2);
        }
        if (this.f0 && (findItem = menu.findItem(R.id.documents_search)) != null) {
            findItem.setVisible(true);
            findItem.getIcon().setTint(c2);
        }
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.addView(onCreateView);
        return frameLayout;
    }

    @Override // me.grishka.appkit.fragments.TabbedLoaderFragment, me.grishka.appkit.fragments.LoaderFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.m0 = null;
        this.n0.e();
        super.onDestroyView();
    }

    @Override // me.grishka.appkit.fragments.TabbedLoaderFragment, androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.documents_add) {
            if (mo2getContext() == null) {
                return false;
            }
            vo();
            return true;
        }
        if (itemId != R.id.documents_search) {
            return this.l0.j(menuItem);
        }
        SearchDocumentsListFragment.a aVar = new SearchDocumentsListFragment.a();
        aVar.y(this.p0);
        aVar.k(mo2getContext());
        return true;
    }

    @Override // com.vkontakte.android.fragments.VkTabbedLoaderFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        bk1 bk1Var = new bk1(this, 16);
        fVar.getClass();
        this.n0.b(new i0(fVar, bk1Var).a0(asu0.a.d()).subscribe(new sf(this, 23)));
        this.l0.f().setTabMode(0);
        setTitle(R.string.docs);
        setHasOptionsMenu(true);
        qo();
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final void po() {
        UserId userId = this.p0;
        this.r0.getClass();
        q a2 = dvn.a(userId);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.n0.b(a2.E(this.v0, lVar, kVar, kVar).subscribe(this.u0, this.w0));
    }

    @Override // me.grishka.appkit.fragments.TabbedLoaderFragment
    public final void uo() {
        this.m0.get(this.l0.e()).s();
    }

    public final void vo() {
        Toolbar toolbar;
        if (mo2getContext() == null || !this.o0 || (toolbar = this.Q) == null) {
            return;
        }
        int childCount = toolbar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                View childAt2 = ((ActionMenuView) childAt).getChildAt(0);
                if (childAt2 != null) {
                    if (childAt2.getWidth() == 0) {
                        qj80.a(childAt2, new ne9(3, this, childAt2));
                        return;
                    } else {
                        wo(childAt2);
                        return;
                    }
                }
                return;
            }
        }
    }

    public final void wo(View view) {
        e.b a2 = VkContextMenu.e.a(dhr0.t.c(R.attr.vk_ui_icon_accent), view);
        a2.b(R.string.add_doc_photo, this.s0, new m3g(this, 12));
        a2.b(R.string.add_doc_file, this.t0, new bfm(this, 2));
        a2.a().g();
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void h() {
    }
}
