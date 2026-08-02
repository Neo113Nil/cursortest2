package com.vk.file_picker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.X3;
import com.vk.log.L;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import com.vkontakte.android.ui.EmptyView;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import me.grishka.appkit.fragments.VKToolbarFragment;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.bwt0;
import xsna.cnh;
import xsna.dhr0;
import xsna.dun;
import xsna.e3m;
import xsna.e43;
import xsna.ebs;
import xsna.er;
import xsna.ey90;
import xsna.f5h0;
import xsna.h7u0;
import xsna.iah0;
import xsna.j6r0;
import xsna.kn4;
import xsna.oz50;
import xsna.pvo0;
import xsna.s8g0;
import xsna.sa6;
import xsna.too0;
import xsna.tvo;
import xsna.u1u0;
import xsna.wc6;
import xsna.x9r;
import xsna.y9r;
import xsna.yx90;
import xsna.z1h0;

/* loaded from: classes18.dex */
public class FilePickerFragment extends VKToolbarFragment implements tvo.a, too0 {
    public static final /* synthetic */ int m0 = 0;
    public UsableRecyclerView b0;
    public LinearLayoutManager c0;
    public File h0;
    public EmptyView i0;
    public s8g0 j0;
    public long k0;
    public final ArrayList<f> d0 = new ArrayList<>();
    public final d e0 = new d();
    public final ArrayList<e> f0 = new ArrayList<>();
    public ArrayList<String> g0 = new ArrayList<>();
    public final a l0 = new a();

    public class a extends BroadcastReceiver {

        /* renamed from: com.vk.file_picker.FilePickerFragment$a$a, reason: collision with other inner class name */
        public class RunnableC1065a implements Runnable {
            public RunnableC1065a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                FilePickerFragment filePickerFragment = FilePickerFragment.this;
                int i = FilePickerFragment.m0;
                File file = filePickerFragment.h0;
                if (file == null) {
                    filePickerFragment.qo();
                } else {
                    filePickerFragment.po(file);
                }
            }
        }

        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            L.p("vk", "Receive " + intent);
            RunnableC1065a runnableC1065a = new RunnableC1065a();
            if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                u1u0.f(1000L, runnableC1065a);
            } else {
                runnableC1065a.run();
            }
        }
    }

    public class b implements Comparator<File> {
        @Override // java.util.Comparator
        public final int compare(File file, File file2) {
            File file3 = file;
            File file4 = file2;
            return file3.isDirectory() != file4.isDirectory() ? file3.isDirectory() ? -1 : 1 : file3.getName().compareToIgnoreCase(file4.getName());
        }
    }

    public static class c extends oz50 {
    }

    public class d extends UsableRecyclerView.c<dun<f>> {
        public d() {
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final String B(int i, int i2) {
            return FilePickerFragment.this.d0.get(i).f;
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final int G(int i) {
            return FilePickerFragment.this.d0.get(i).f != null ? 1 : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return FilePickerFragment.this.d0.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            FilePickerFragment filePickerFragment = FilePickerFragment.this;
            return (filePickerFragment.d0.get(i).f != null || filePickerFragment.d0.get(i).b == 0) ? 1 : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            ((dun) e0Var).V5(FilePickerFragment.this.d0.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return FilePickerFragment.this.new g(viewGroup.getContext(), i);
        }
    }

    public class e {
        public int a;
        public int b;
        public File c;
        public String d;
    }

    public static class f implements wc6 {
        public int b;
        public String c;
        public String d = "";
        public String e = "";
        public String f;
        public File g;

        @Override // xsna.wc6
        public final int D() {
            return 0;
        }

        @Override // xsna.wc6
        public final String P7() {
            return this.e;
        }

        @Override // xsna.wc6
        public final long getSize() {
            return 0L;
        }

        @Override // xsna.wc6
        public final String getTitle() {
            return this.c;
        }
    }

    public class g extends dun<f> {
        public g(@NonNull Context context, int i) {
            super(context);
            if (i == 0) {
                this.q.setActualScaleType(f5h0.e.a);
            } else {
                if (i != 1) {
                    return;
                }
                this.q.setActualScaleType(f5h0.f.a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.dun, me.grishka.appkit.views.UsableRecyclerView.e
        public final void onClick() {
            File file = ((f) this.m).g;
            boolean isDirectory = file.isDirectory();
            FilePickerFragment filePickerFragment = FilePickerFragment.this;
            if (isDirectory) {
                e eVar = new e();
                eVar.a = filePickerFragment.c0.v();
                eVar.b = filePickerFragment.b0.getChildAt(0).getTop();
                eVar.c = filePickerFragment.h0;
                eVar.d = filePickerFragment.Q.getTitle().toString();
                if (filePickerFragment.po(file)) {
                    filePickerFragment.f0.add(eVar);
                    filePickerFragment.setTitle(((f) this.m).c);
                    filePickerFragment.c0.scrollToPosition(0);
                    return;
                }
                return;
            }
            if (!file.canRead()) {
                String g6 = g6(R.string.access_error);
                int i = FilePickerFragment.m0;
                filePickerFragment.ro(g6);
                return;
            }
            if (filePickerFragment.k0 > 0) {
                long length = file.length();
                long j = filePickerFragment.k0;
                if (length > j) {
                    filePickerFragment.ro(h6(R.string.file_upload_limit, dun.s6(j, b6())));
                    return;
                }
            }
            String uri = er.a(X3.i.b).path(file.getAbsolutePath()).build().toString();
            ArrayList<String> arrayList = new ArrayList<>(1);
            arrayList.add(uri);
            Intent putStringArrayListExtra = new Intent().putStringArrayListExtra("files", arrayList);
            z1h0 parentFragment = filePickerFragment.getParentFragment();
            if (parentFragment instanceof y9r) {
                ((y9r) parentFragment).Fj(-1, putStringArrayListExtra);
                return;
            }
            FragmentActivity activity = filePickerFragment.getActivity();
            if (activity != null) {
                activity.setResult(-1, putStringArrayListExtra);
            }
            filePickerFragment.Mf(-1, putStringArrayListExtra);
        }

        @Override // xsna.dun
        public final void v6(TextView textView, f fVar) {
            f fVar2 = fVar;
            super.v6(textView, fVar2);
            u1u0.i(textView, fVar2.d, true);
            this.q.q0(fVar2.b);
        }

        @Override // xsna.dun
        /* renamed from: x6, reason: merged with bridge method [inline-methods] */
        public final void i6(f fVar) {
            super.i6(fVar);
            if (FilePickerFragment.this.g0.contains(fVar.e)) {
                this.itemView.setAlpha(0.4f);
                this.itemView.setOnClickListener(new x9r());
            } else {
                this.itemView.setAlpha(1.0f);
                this.itemView.setOnClickListener(new sa6(this, 5));
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        d dVar = this.e0;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        ArrayList<e> arrayList = this.f0;
        if (arrayList.size() <= 0) {
            return false;
        }
        e remove = arrayList.remove(arrayList.size() - 1);
        setTitle(remove.d);
        File file = remove.c;
        if (file != null) {
            po(file);
        } else {
            qo();
        }
        this.c0.K(remove.a, remove.b);
        return true;
    }

    @Override // me.grishka.appkit.fragments.ToolbarFragment
    public final View no(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        bwt0.Z(R.attr.vk_ui_background_content, frameLayout);
        UsableRecyclerView usableRecyclerView = new UsableRecyclerView(getActivity());
        this.b0 = usableRecyclerView;
        WeakHashMap weakHashMap = j6r0.a;
        usableRecyclerView.setPadding(0, iah0.a(8.0f), 0, iah0.a(8.0f));
        this.b0.setClipToPadding(false);
        UsableRecyclerView usableRecyclerView2 = this.b0;
        layoutInflater.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.c0 = linearLayoutManager;
        usableRecyclerView2.setLayoutManager(linearLayoutManager);
        this.b0.setAdapter(this.e0);
        this.b0.setSelector(R.drawable.highlight);
        frameLayout.addView(this.b0);
        FragmentActivity activity2 = getActivity();
        int i = EmptyView.b;
        EmptyView emptyView = (EmptyView) View.inflate(activity2, R.layout.empty, null);
        emptyView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 17));
        emptyView.findViewById(R.id.empty_button).setVisibility(8);
        this.i0 = emptyView;
        emptyView.setButtonVisible(false);
        this.i0.setText(R.string.no_files);
        this.i0.setContentDescription(activity.getString(R.string.no_files));
        frameLayout.addView(this.i0);
        this.b0.setEmptyView(this.i0);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout.addView(frameLayout2);
        ebs c2 = kn4.c(this);
        dhr0.a.getClass();
        Context E = dhr0.E();
        ey90 ey90Var = new ey90(e3m.f(R.attr.vk_ui_background_content, E), e3m.f(R.attr.vk_ui_text_subhead, E));
        PermissionHelper.a.getClass();
        String[] strArr = PermissionHelper.e;
        s8g0 s8g0Var = new s8g0(c2, frameLayout2, ey90Var, new yx90(R.string.vk_permissions_storage, 16, strArr, strArr, true), new cnh(this, 8), null, null, null, null, null);
        this.j0 = s8g0Var;
        s8g0Var.c(false);
        return frameLayout;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.j0.onActivityResult(i, i2, intent);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_BAD_REMOVAL");
        intentFilter.addAction("android.intent.action.MEDIA_CHECKING");
        intentFilter.addAction("android.intent.action.MEDIA_EJECT");
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_NOFS");
        intentFilter.addAction("android.intent.action.MEDIA_REMOVED");
        intentFilter.addAction("android.intent.action.MEDIA_SHARED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTABLE");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme(X3.i.b);
        e43.a.registerReceiver(this.l0, intentFilter);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.k0 = arguments.getLong("size_limit", 0L);
            if (arguments.containsKey("unavailable_extensions")) {
                this.g0 = arguments.getStringArrayList("unavailable_extensions");
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        e43.a.unregisterReceiver(this.l0);
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // androidx.fragment.app.Fragment, xsna.h90.a
    public final void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.j0.onRequestPermissionsResult(i, strArr, iArr);
    }

    public final String oo(String str) {
        try {
            StatFs statFs = new StatFs(str);
            long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
            long availableBlocks = statFs.getAvailableBlocks() * statFs.getBlockSize();
            L.p("vk", str + ": " + availableBlocks + DomExceptionUtils.SEPARATOR + blockCount);
            return blockCount == 0 ? "" : getString(R.string.file_free_subtitle, dun.s6(availableBlocks, getResources()), dun.s6(blockCount, getResources()));
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // xsna.tvo.a
    public final void pc(int i, @NonNull List<String> list) {
        this.j0.pc(i, list);
    }

    public final boolean po(File file) {
        boolean canRead = file.canRead();
        ArrayList<f> arrayList = this.d0;
        if (!canRead) {
            if ((!file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) && !file.getAbsolutePath().startsWith("/sdcard") && !file.getAbsolutePath().startsWith("/mnt/sdcard")) || Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageState().equals("mounted_ro")) {
                ro(getString(R.string.access_error));
                return false;
            }
            this.h0 = file;
            arrayList.clear();
            if ("shared".equals(Environment.getExternalStorageState())) {
                this.i0.setText(R.string.file_usb_active);
            } else {
                this.i0.setText(R.string.file_not_mounted);
            }
            this.e0.notifyDataSetChanged();
            return true;
        }
        this.i0.setText(R.string.no_files);
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                ro(getString(R.string.unknown_error));
                return false;
            }
            this.h0 = file;
            arrayList.clear();
            Arrays.sort(listFiles, new b());
            for (File file2 : listFiles) {
                if (!file2.getName().startsWith(".")) {
                    f fVar = new f();
                    fVar.c = file2.getName();
                    fVar.g = file2;
                    if (file2.isDirectory()) {
                        fVar.b = R.drawable.vk_icon_folder_24;
                    } else {
                        String name = file2.getName();
                        fVar.e = com.vk.core.files.a.g(name) != null ? com.vk.core.files.a.g(name) : "?";
                        fVar.d = dun.s6(file2.length(), getResources());
                        if (file2.lastModified() > 0) {
                            fVar.d += ", " + pvo0.k((int) (file2.lastModified() / 1000), getResources(), false);
                        }
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            fVar.f = er.a(X3.i.b).path(file2.getAbsolutePath()).appendQueryParameter("max_w", iah0.a(64.0f) + "").appendQueryParameter("max_h", iah0.a(48.0f) + "").build().toString().replace("file:/", "file:///");
                        }
                    }
                    arrayList.add(fVar);
                }
            }
            this.e0.notifyDataSetChanged();
            return true;
        } catch (Exception e2) {
            L.C("vk", e2);
            ro(e2.getLocalizedMessage());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0145 A[LOOP:1: B:44:0x013f->B:46:0x0145, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void qo() {
        int i;
        Iterator<f> it;
        int length;
        int i2;
        BufferedReader bufferedReader;
        HashMap hashMap;
        ArrayList arrayList;
        String str;
        setTitle(R.string.pick_file);
        this.h0 = null;
        ArrayList<f> arrayList2 = this.d0;
        arrayList2.clear();
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        f fVar = new f();
        fVar.c = getString(Environment.isExternalStorageRemovable() ? R.string.file_sd_card : R.string.file_internal_storage);
        fVar.b = Environment.isExternalStorageRemovable() ? R.drawable.vk_icon_memory_card_32 : R.drawable.vk_icon_deprecated_ic_storage;
        fVar.d = oo(absolutePath);
        fVar.g = Environment.getExternalStorageDirectory();
        arrayList2.add(fVar);
        int i3 = 0;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/mounts"));
            hashMap = new HashMap();
            arrayList = new ArrayList();
            str = null;
        } catch (Exception e2) {
            e = e2;
            i = i3;
        }
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            if (!readLine.contains("/mnt")) {
                if (!readLine.contains("/storage")) {
                    if (readLine.contains("/sdcard")) {
                    }
                    i = i3;
                    i3 = i;
                }
            }
            if (!readLine.contains("asec") && !readLine.contains("tmpfs") && !readLine.contains("none")) {
                String[] split = readLine.split(" ");
                if (!hashMap.containsKey(split[i3])) {
                    hashMap.put(split[i3], new ArrayList());
                }
                i = i3;
                try {
                    ((ArrayList) hashMap.get(split[i3])).add(split[1]);
                    if (split[1].equals(absolutePath)) {
                        str = split[i];
                    }
                    arrayList.add(split[1]);
                    i3 = i;
                } catch (Exception e3) {
                    e = e3;
                }
            }
            i = i3;
            i3 = i;
            e = e3;
            L.C("vk", e);
            ArrayList arrayList3 = new ArrayList();
            it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(it.next().g.getAbsolutePath());
            }
            File[] externalFilesDirs = mo2getContext().getExternalFilesDirs(null);
            length = externalFilesDirs.length;
            for (i2 = i; i2 < length; i2++) {
                File file = externalFilesDirs[i2];
                while (file != null && file.getAbsolutePath().contains(X3.d)) {
                    file = file.getParentFile();
                }
                if (file != null && !arrayList3.contains(file.getAbsolutePath())) {
                    boolean isExternalStorageRemovable = Environment.isExternalStorageRemovable(file);
                    boolean equals = file.equals(Environment.getExternalStorageDirectory());
                    f fVar2 = new f();
                    fVar2.c = getString(isExternalStorageRemovable ? R.string.file_sd_card : equals ? R.string.file_internal_storage : R.string.file_external_storage);
                    fVar2.b = isExternalStorageRemovable ? R.drawable.vk_icon_memory_card_32 : R.drawable.vk_icon_deprecated_ic_storage;
                    fVar2.d = oo(file.getAbsolutePath());
                    fVar2.g = file;
                    arrayList2.add(fVar2);
                }
            }
            this.e0.notifyDataSetChanged();
        }
        i = i3;
        bufferedReader.close();
        if (str != null) {
            arrayList.removeAll((Collection) hashMap.get(str));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                try {
                    boolean A = com.vk.core.files.a.A(str2);
                    f fVar3 = new f();
                    fVar3.c = getString(A ? R.string.file_sd_card : R.string.file_external_storage);
                    fVar3.b = R.drawable.vk_icon_memory_card_32;
                    fVar3.d = oo(str2);
                    fVar3.g = new File(str2);
                    arrayList2.add(fVar3);
                } catch (Exception unused) {
                }
            }
        }
        ArrayList arrayList32 = new ArrayList();
        it = arrayList2.iterator();
        while (it.hasNext()) {
        }
        File[] externalFilesDirs2 = mo2getContext().getExternalFilesDirs(null);
        length = externalFilesDirs2.length;
        while (i2 < length) {
        }
        this.e0.notifyDataSetChanged();
    }

    public final void ro(String str) {
        h7u0.a aVar = new h7u0.a(getActivity());
        aVar.g0(R.string.error);
        aVar.a.f = str;
        aVar.c0(R.string.ok, null);
        aVar.m();
    }

    @Override // xsna.tvo.a
    public final void wi(int i, @NonNull List<String> list) {
        this.j0.wi(i, list);
    }
}
