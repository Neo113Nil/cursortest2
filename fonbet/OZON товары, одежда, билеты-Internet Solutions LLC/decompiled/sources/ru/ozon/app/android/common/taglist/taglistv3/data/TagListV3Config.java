package ru.ozon.app.android.common.taglist.taglistv3.data;

import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0006\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0015\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/common/taglist/taglistv3/data/TagListV3Config;", "Lj20/a;", "Lru/ozon/app/android/common/taglist/taglistv3/data/TagListV3DTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "modifyTestInfoIfNeeded", "(Lru/ozon/app/android/common/taglist/taglistv3/data/TagListV3DTO;)Lru/ozon/app/android/common/taglist/taglistv3/data/TagListV3DTO;", "Lj20/b;", "state", "parse", "(Lj20/b;)Lru/ozon/app/android/common/taglist/taglistv3/data/TagListV3DTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "", "supportedVersions", "[J", "getSupportedVersions", "()[J", "Companion", "taglist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TagListV3Config implements InterfaceC7243a<TagListV3DTO> {

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final long[] supportedVersions;

    public TagListV3Config(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
        this.supportedVersions = new long[]{3};
    }

    private final TagListV3DTO modifyTestInfoIfNeeded(TagListV3DTO tagListV3DTO) {
        List<AtomDTO> tags = tagListV3DTO.getTags();
        ArrayList arrayList = new ArrayList(C7714v.z(tags, 10));
        for (Object obj : tags) {
            if (obj instanceof TagV3Atom.TagAtom) {
                TagV3Atom.TagAtom tagAtom = (TagV3Atom.TagAtom) obj;
                if (tagAtom.getTestInfo() != null) {
                    TestInfo testInfo = tagAtom.getTestInfo();
                    TestInfo testInfo2 = null;
                    if (testInfo != null) {
                        TestInfo testInfo3 = tagAtom.getTestInfo();
                        testInfo2 = testInfo.copy((testInfo3 != null ? testInfo3.getAutomatizationId() : null) + "." + (tagAtom.isSelected() ? "selected" : "default"));
                    }
                    obj = TagV3Atom.TagAtom.copy$default(tagAtom, null, null, null, null, false, null, null, null, testInfo2, null, 767, null);
                }
            }
            arrayList.add(obj);
        }
        return TagListV3DTO.copy$default(tagListV3DTO, arrayList, null, null, null, null, null, null, null, null, null, null, null, 4094, null);
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        InterfaceC7243a.C1128a.a(c7244b);
        return true;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return M.f71699a;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return this.supportedVersions;
    }

    @Override // j20.InterfaceC7243a
    public TagListV3DTO parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return modifyTestInfoIfNeeded((TagListV3DTO) this.jsonDeserializer.fromJson(state.b(), TagListV3DTO.class));
    }
}
