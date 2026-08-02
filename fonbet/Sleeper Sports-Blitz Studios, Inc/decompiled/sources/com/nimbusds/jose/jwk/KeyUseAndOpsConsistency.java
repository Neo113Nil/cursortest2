package com.nimbusds.jose.jwk;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
class KeyUseAndOpsConsistency {
    static final Map<KeyUse, Set<KeyOperation>> MAP;

    KeyUseAndOpsConsistency() {
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(KeyUse.SIGNATURE, new HashSet(Arrays.asList(KeyOperation.SIGN, KeyOperation.VERIFY)));
        hashMap.put(KeyUse.ENCRYPTION, new HashSet(Arrays.asList(KeyOperation.ENCRYPT, KeyOperation.DECRYPT, KeyOperation.WRAP_KEY, KeyOperation.UNWRAP_KEY)));
        MAP = Collections.unmodifiableMap(hashMap);
    }

    static boolean areConsistent(KeyUse keyUse, Set<KeyOperation> set) {
        if (keyUse != null && set != null) {
            Map<KeyUse, Set<KeyOperation>> map = MAP;
            if (map.containsKey(keyUse) && !map.get(keyUse).containsAll(set)) {
                return false;
            }
        }
        return true;
    }
}
