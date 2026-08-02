package com.vk.permission.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.image.c;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.awt0;
import xsna.c98;
import xsna.drm0;
import xsna.dw20;
import xsna.e370;
import xsna.epx;
import xsna.fkf0;
import xsna.ifx0;
import xsna.m4w;
import xsna.qas;
import xsna.qoy;
import xsna.rbe;
import xsna.tf3;
import xsna.urd0;

/* compiled from: VkSeparatePermissionDialog.kt */
/* loaded from: classes4.dex */
public final class VkSeparatePermissionDialog extends dw20 {
    public static final /* synthetic */ int h1 = 0;
    public b f1;
    public qas g1;

    /* compiled from: VkSeparatePermissionDialog.kt */
    public static final class a {
        public static VkSeparatePermissionDialog a(String str, String str2, String str3, ArrayList arrayList) {
            VkSeparatePermissionDialog vkSeparatePermissionDialog = new VkSeparatePermissionDialog();
            Bundle bundle = new Bundle(4);
            bundle.putString("arg_photo", str);
            bundle.putString("arg_title", str2);
            bundle.putString("arg_subtitle", str3);
            bundle.putParcelableArrayList("arg_permission_items", arrayList);
            vkSeparatePermissionDialog.setArguments(bundle);
            return vkSeparatePermissionDialog;
        }
    }

    /* compiled from: VkSeparatePermissionDialog.kt */
    public static final class b extends RecyclerView.Adapter<a> {
        public final ArrayList c;

        /* compiled from: VkSeparatePermissionDialog.kt */
        public final class a extends RecyclerView.e0 implements CompoundButton.OnCheckedChangeListener {
            public final CheckBox l;
            public final TextView m;
            public final TextView n;

            public a(View view) {
                super(view);
                this.l = (CheckBox) view.findViewById(R.id.checkbox);
                this.m = (TextView) view.findViewById(R.id.title);
                this.n = (TextView) view.findViewById(R.id.subtitle);
                view.setOnClickListener(new rbe(this, 9));
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ArrayList arrayList = b.this.c;
                int adapterPosition = getAdapterPosition();
                if (adapterPosition < 0 || adapterPosition >= arrayList.size()) {
                    return;
                }
                PermissionItem permissionItem = (PermissionItem) arrayList.get(adapterPosition);
                arrayList.set(adapterPosition, new PermissionItem(permissionItem.b, permissionItem.c, permissionItem.d, permissionItem.e, z));
            }
        }

        public b(List<PermissionItem> list) {
            this.c = new ArrayList(list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(a aVar, int i) {
            a aVar2 = aVar;
            PermissionItem permissionItem = (PermissionItem) this.c.get(i);
            View view = aVar2.itemView;
            boolean z = permissionItem.e;
            view.setEnabled(z);
            CheckBox checkBox = aVar2.l;
            checkBox.setOnCheckedChangeListener(null);
            checkBox.setChecked(permissionItem.f);
            checkBox.setOnCheckedChangeListener(aVar2);
            checkBox.setEnabled(z);
            aVar2.m.setText(permissionItem.c);
            TextView textView = aVar2.n;
            textView.setText(permissionItem.d);
            awt0.v(textView, !drm0.N(r5));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new a(tf3.b(viewGroup, R.layout.vk_item_permission, viewGroup, false));
        }
    }

    public final void Yn(qas qasVar) {
        this.g1 = qasVar;
    }

    @Override // xsna.dw20, androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        qas qasVar = this.g1;
        if (qasVar != null) {
            qasVar.c();
        }
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        View inflate = LayoutInflater.from(mo2getContext()).inflate(R.layout.vk_bottom_sheet_separate_permissions, (ViewGroup) null, false);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("arg_photo");
        String string2 = requireArguments.getString("arg_title");
        String string3 = requireArguments.getString("arg_subtitle");
        List parcelableArrayList = requireArguments.getParcelableArrayList("arg_permission_items");
        if (parcelableArrayList == null) {
            parcelableArrayList = EmptyList.b;
        }
        b bVar = new b(parcelableArrayList);
        this.f1 = bVar;
        VKReplacerView vKReplacerView = (VKReplacerView) inflate.findViewById(R.id.photo);
        ifx0 ifx0Var = e370.c;
        if (ifx0Var == null) {
            ifx0Var = null;
        }
        VKImageController<View> create = ifx0Var.b().create(vKReplacerView.getContext());
        vKReplacerView.a(((c) create).getView());
        create.f(string, new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, true, 0, null, null, null, VKImageController.ScaleType.CENTER_CROP, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65275));
        ((TextView) inflate.findViewById(R.id.title)).setText(string2);
        ((TextView) inflate.findViewById(R.id.subtitle)).setText(string3);
        View findViewById = inflate.findViewById(R.id.shadow);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.list);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(bVar);
        fkf0 fkf0Var = new fkf0(recyclerView, null, findViewById, 0);
        RecyclerView recyclerView2 = fkf0Var.b;
        recyclerView2.removeOnScrollListener(fkf0Var);
        recyclerView2.addOnScrollListener(fkf0Var);
        awt0.v((ViewGroup) inflate.findViewById(R.id.list_container), !parcelableArrayList.isEmpty());
        ((VkButton) inflate.findViewById(R.id.action_button)).setOnClickListener(new m4w(this, 6));
        ((VkButton) inflate.findViewById(R.id.dismiss_button)).setOnClickListener(new c98(this, 18));
        dw20.Rn(this, inflate, 6);
        return super.yn(bundle);
    }

    /* compiled from: VkSeparatePermissionDialog.kt */
    public static final class PermissionItem implements Parcelable {
        public static final a CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;
        public final boolean e;
        public final boolean f;

        /* compiled from: VkSeparatePermissionDialog.kt */
        public static final class a implements Parcelable.Creator<PermissionItem> {
            @Override // android.os.Parcelable.Creator
            public final PermissionItem createFromParcel(Parcel parcel) {
                return new PermissionItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final PermissionItem[] newArray(int i) {
                return new PermissionItem[i];
            }
        }

        public PermissionItem(String str, String str2, String str3, boolean z, boolean z2) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = z;
            this.f = z2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PermissionItem)) {
                return false;
            }
            PermissionItem permissionItem = (PermissionItem) obj;
            return epx.f(this.b, permissionItem.b) && epx.f(this.c, permissionItem.c) && epx.f(this.d, permissionItem.d) && this.e == permissionItem.e && this.f == permissionItem.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + qoy.b(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PermissionItem(key=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", subtitle=");
            sb.append(this.d);
            sb.append(", isEnabled=");
            sb.append(this.e);
            sb.append(", isChecked=");
            return q0.a(sb, this.f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public PermissionItem(Parcel parcel) {
            this(r1, r2, r3, r4, parcel.readByte() == 0 ? r0 : true);
            boolean z;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z2 = false;
            if (parcel.readByte() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
        }
    }
}
