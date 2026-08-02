package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.LinkedList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class OverridingUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <H> Collection<H> selectMostSpecificInEachOverridableGroup(@NotNull Collection<? extends H> collection, @NotNull Function1<? super H, ? extends CallableDescriptor> function1) {
        collection.getClass();
        function1.getClass();
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        SmartSet create = SmartSet.Companion.create();
        while (!linkedList.isEmpty()) {
            Object Y = CollectionsKt.Y(linkedList);
            SmartSet create2 = SmartSet.Companion.create();
            Collection extractMembersOverridableInBothWays = OverridingUtil.extractMembersOverridableInBothWays(Y, linkedList, function1, new OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1(create2));
            extractMembersOverridableInBothWays.getClass();
            if (extractMembersOverridableInBothWays.size() == 1 && create2.isEmpty()) {
                Object C0 = CollectionsKt.C0(extractMembersOverridableInBothWays);
                C0.getClass();
                create.add(C0);
            } else {
                Object selectMostSpecificMember = OverridingUtil.selectMostSpecificMember(extractMembersOverridableInBothWays, function1);
                selectMostSpecificMember.getClass();
                CallableDescriptor callableDescriptor = (CallableDescriptor) function1.invoke(selectMostSpecificMember);
                for (Object obj : extractMembersOverridableInBothWays) {
                    obj.getClass();
                    if (!OverridingUtil.isMoreSpecific(callableDescriptor, (CallableDescriptor) function1.invoke(obj))) {
                        create2.add(obj);
                    }
                }
                if (!create2.isEmpty()) {
                    create.addAll(create2);
                }
                create.add(selectMostSpecificMember);
            }
        }
        return create;
    }
}
